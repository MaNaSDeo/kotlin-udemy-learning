# 📘 First Lecture – Day 1 of Kotlin + Android Learning

---

### 🚫 Problem 1: App changes not reflecting instantly

When I started building my first app using Jetpack Compose, I noticed that **every time I made a code change**, I had to **manually stop and restart the app** to see the updated UI. This was slowing me down a lot.

#### ✅ Solution: Enable Live Edit

To fix this, I enabled **Live Edit** in Android Studio:

> `Preferences > Editor > Live Edit`  
> and selected: **"Push edits manually on save"**

Now, whenever I make a change in my Composables and press **`Cmd + S`** (save), the update reflects **instantly on the emulator** — no need to restart the app manually.

---

### 🤔 Problem 2: Confusion with Multiple `Greeting()` Functions

In `MainActivity.kt`, there are two `Greeting()` usages that looked similar but serve different purposes:

1. 🧪 **`GreetingPreview()`**
    - Located **below the `@Preview` annotation**
    - Used **only for showing a preview inside Android Studio**
    - **Does not affect** what is displayed in the emulator

2. 📱 **`Greeting()` inside `MainActivity`'s `setContent {}`**
    - This is the **actual composable** that renders the UI in the running app
    - **Directly affects** what you see in the emulator

#### 🔍 Key Takeaway:
> The `@Preview` function is just for design-time UI previews.  
> The real UI in the emulator is built from what you include inside `setContent {}` in your `MainActivity`.

---

### 🔭 Need to Look Next Day

- [ ] ❓ **What is Jetpack Compose?**

---

_Commit Date: 📅 `2025-06-24`_

