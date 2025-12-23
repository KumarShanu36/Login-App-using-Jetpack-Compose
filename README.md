# 🔐 Login App using Jetpack Compose

A modern **Login Screen Android application** built using **Jetpack Compose** without using any XML layouts.  
This project demonstrates **state management, UI controls, system UI customization, and Compose best practices**.

---

## 📱 Project Overview

This Android application implements a **login screen** with a clean and minimal UI using **Jetpack Compose**.  
It includes input validation, interactive controls, and customized system UI elements such as the **status bar color**.

The app is fully developed using **Kotlin + Jetpack Compose**, following **Material 3** design principles.

---

## ✨ Features

- ✅ Jetpack Compose UI (No XML used)
- 🔐 Password masking (`*`) using `PasswordVisualTransformation`
- 🎨 Custom theme color (`#004953`) applied to:
  - Status bar (battery, network, time)
  - Top app bar
  - Checkboxes
  - Switches
  - Login button
- ☑️ Remember Me (Checkbox + Switch)
- 🔔 Enable Notification (Independent Checkbox & Switch)
- 📱 Compact and responsive layout
- 🔁 State management using `remember` and `mutableStateOf`
- 🔔 Toast message on successful login
- 🔀 Navigation to next screen using explicit `Intent`
- 🧪 UI Preview using `@Preview`

---

## 🧠 Concepts Used (Syllabus Aligned)

- Jetpack Compose basics
- State management (`mutableStateOf`, `remember`)
- Input controls:
  - `TextField`
  - `Checkbox`
  - `Switch`
  - `Button`
- `LocalContext` for Toast and navigation
- Password handling using `PasswordVisualTransformation`
- System UI customization (Status Bar color)
- `@Preview` for UI testing
- No XML layout usage

---

## 🖼️ UI Components

- **Username & Password TextField**
- **Masked Password Input**
- **Remember Me** checkbox & switch
- **Enable Notification** checkbox & switch
- **Rectangle Login Button with curved edges**
- Informational text below login button

---

## 🛠️ Tech Stack

- **Language:** Kotlin  
- **UI Toolkit:** Jetpack Compose  
- **Design:** Material 3  
- **IDE:** Android Studio  

---

## ▶️ How to Run the Project

1. Open **Android Studio**
2. Click **Open Project**
3. Select the project folder
4. Let Gradle sync complete
5. Connect a real Android device **OR** start an emulator
6. Click ▶ **Run**

---

## 📌 Validation Logic

- Username must have **at least 4 characters**
- Password must have **at least 6 characters**
- Shows a **Toast message** on success or failure

---

## 🧪 Preview Support

This project includes a `@Preview` composable for UI preview inside Android Studio:

```kotlin
@Preview(showBackground = true)
@Composable
fun PreviewLogin() {
    LoginScreen()
}

📂 Project Structure
app/
 └── src/
     └── main/
         └── java/
             └── com/example/logincompose/
                 ├── MainActivity.kt
                 └── HomeActivity.kt

🚫 No XML Used

This project strictly follows Jetpack Compose guidelines.
No XML layout files are used.

📄 License

This project is created for learning and academic purposes.
Feel free to fork and modify.

🙌 Author

Kumar Shanu
B.Tech CSE | Android Development | Jetpack Compose

⭐ If you like this project, don’t forget to star the repository!


---

If you want, I can also:
- ✨ Add **screenshots section**
- 🧾 Make it **ATS / resume friendly**
- 🏷️ Add **badges (Kotlin, Android, Compose)**

Just tell me 👍
