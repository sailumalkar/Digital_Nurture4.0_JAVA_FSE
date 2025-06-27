--Scenario - 1
--Write a stored procedure ProcessMonthlyInterest that calculates and updates the balance of all savings accounts by applying an interest rate of 1% to the current balance.
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE Accounts
  SET Balance = Balance + (Balance * 0.01)
  WHERE AccountType = 'Savings';

  UPDATE Accounts
  SET LastModified = SYSDATE
  WHERE AccountType = 'Savings';

  DBMS_OUTPUT.PUT_LINE('Interest applied to all savings accounts.');
END;
/

SELECT * from ACCOUNTS;

BEGIN
    ProcessMonthlyInterest();
END;
SELECT * from ACCOUNTS;

--Scenario - 2
--Write a stored procedure UpdateEmployeeBonus that updates the salary of employees in a given department by adding a bonus percentage passed as a parameter.
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  department IN VARCHAR2,
  bonus_percent IN NUMBER
) IS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * bonus_percent / 100)
  WHERE Department = department;

  DBMS_OUTPUT.PUT_LINE('Bonus applied to department: ' || department);
  SELECT  * from EMPLOYEES;
END;
/

BEGIN
  UpdateEmployeeBonus('IT', 10);
END;
/

--Scenario - 3
--Write a stored procedure TransferFunds that transfers a specified amount from one account to another, checking that the source account has sufficient balance before making the transfer.
CREATE OR REPLACE PROCEDURE TransferFunds(
  from_account IN NUMBER,
  to_account IN NUMBER,
  trans_amount IN NUMBER
) IS
  org_balance NUMBER;
BEGIN
  -- Check balance of source account
  SELECT Balance INTO org_balance
  FROM Accounts
  WHERE AccountID = from_account;

  IF org_balance < trans_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in source account.');
  END IF;

  -- Deduct if org_balance is more than required balance to be transfered
  UPDATE Accounts
  SET Balance = Balance - trans_amount,
      LastModified = SYSDATE
  WHERE AccountID = from_account;

  -- Add to destination
  UPDATE Accounts
  SET Balance = Balance + trans_amount,
      LastModified = SYSDATE
  WHERE AccountID = to_account;

  DBMS_OUTPUT.PUT_LINE('Transferred ' || trans_amount || ' from account ' || from_account || ' to ' || to_account);
END;
/

select * from ACCOUNTS;

BEGIN
    TransferFunds(1, 2, 100);
END;