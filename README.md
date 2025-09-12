# 🍳 Android Food Recipe App

A modern Android application built with Kotlin that helps users discover, browse, and manage delicious food recipes. This app provides an intuitive interface for food enthusiasts to explore various cuisines and cooking techniques.

<div align="center">
  <p><em>A modern Android application showcasing food categories with beautiful Material Design 3 UI</em></p>
</div>

<p align="left">
  <a href="https://developer.android.com/jetpack/compose"><img alt="Jetpack Compose" src="https://img.shields.io/badge/Jetpack%20Compose-1.6%2B-4285F4?logo=jetpackcompose&logoColor=white"></a>
  <a href="https://m3.material.io/"><img alt="Material 3" src="https://img.shields.io/badge/Material%20Design-3-18A999?logo=materialdesign&logoColor=white"></a>
  <a href="https://kotlinlang.org/"><img alt="Kotlin" src="https://img.shields.io/badge/Kotlin-1.9%2B-7F52FF?logo=kotlin&logoColor=white"></a>
  <a href="https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html"><img alt="JDK" src="https://img.shields.io/badge/JDK-17-007396?logo=java&logoColor=white"></a>
</p>


## ✨ Features

- 🎨 **Modern UI** - Built with Jetpack Compose and Material Design 3
- 📱 **Responsive Design** - Adaptive grid layout for different screen sizes
- ⚡ **Fast Loading** - Async image loading with smooth animations
- 🔄 **Loading States** - Beautiful loading indicators and error handling
- 🍽️ **Rich Content** - Comprehensive food category display
- 🏗️ **Clean Architecture** - MVVM pattern for maintainable code

## 🛠️ Tech Stack

| Component | Technology |
| :-- | :-- |
| **Language** | Kotlin |
| **UI Framework** | Jetpack Compose |
| **Architecture** | MVVM Pattern |
| **Networking** | Retrofit + Gson |
| **Image Loading** | Coil |
| **API Source** | TheMealDB |
| **Design System** | Material Design 3 |


## 📋 Prerequisites

- Android Studio Arctic Fox or later
- Minimum SDK: API 21 (Android 5.0)
- Target SDK: API 34 (Android 14)
- Kotlin 1.8+

## 🚀 Getting Started

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/NareshXcodes/Android-Food-Recipe-App.git
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned repository folder
   - Click "OK"

3. **Build the project**
   - Wait for Gradle sync to complete
   - Build the project using `Build > Make Project`

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click the "Run" button or press `Shift + F10`

## 📖 Usage

1. **Browse Recipes**: Open the app to see featured recipes on the home screen
2. **Search**: Use the search bar to find specific recipes or ingredients
3. **View Details**: Tap on any recipe to view detailed instructions and ingredients
4. **Save Favorites**: Tap the heart icon to save recipes to your favorites

## 🎨 Screenshots

_Add screenshots of your app here to showcase the UI and features_

## 🏗️ Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/yourpackage/
│   │   │   ├── ui/           # UI components and activities
│   │   │   ├── data/         # Data models and repositories
│   │   │   ├── network/      # API service and networking
│   │   │   ├── database/     # Local database components
│   │   │   └── utils/        # Utility classes
│   │   ├── res/             # Resources (layouts, drawables, etc.)
│   │   └── AndroidManifest.xml
│   └── test/                # Unit tests
└── build.gradle            # App-level Gradle file
```

## 🔧 Configuration

## 🔗 API Reference

This application leverages the **[TheMealDB API](https://www.themealdb.com/api.php)** to fetch food category data.

**Endpoint Used:**

```
GET https://www.themealdb.com/api/json/v1/1/categories.php
```


## 📝 License

This project is open source and available under the [MIT License](LICENSE).

## 👤 Author

**NareshXcodes**
- GitHub: [@NareshXcodes](https://github.com/NareshXcodes)

## 📞 Support

If you have any questions or need help with setup, please open an issue in this repository.

<div align="center">
  <p><strong>Made with ❤️ and Kotlin</strong></p>
  <p><em>Don't forget to ⭐ this repository if you found it helpful!</em></p>
</div>

---

⭐ Don't forget to star this repository if you found it helpful!
