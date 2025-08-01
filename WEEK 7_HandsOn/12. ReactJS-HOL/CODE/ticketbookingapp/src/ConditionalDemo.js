// src/ConditionalDemo.js

import React from "react";

// If/Else Statement Example
export function MessageIfElse({ isLoggedIn }) {
  if (isLoggedIn) {
    return <h1>Welcome Back!</h1>;
  }
  return <h1>Please sign in.</h1>;
}

// Ternary Operator Example
export function MessageTernary({ isLoggedIn }) {
  return (
    <h1>{isLoggedIn ? "Welcome Back!" : "Please sign in."}</h1>
  );
}

// Logical AND (&&) Example
export function Notification({ hasNotifications }) {
  return (
    <div>
      {hasNotifications && <p>You have new notifications!</p>}
    </div>
  );
}

// Prevent Component from Rendering
export function OnlyEven({ value }) {
  if (value % 2 !== 0) return null;
  return <div>{value} is even.</div>;
}
