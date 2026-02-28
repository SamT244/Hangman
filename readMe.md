# Hangman Demo Application

This repository contains a simple Spring Boot web application for playing Hangman.

## 📥 Cloning the Repository

1. Install Git:
   - **Windows**: Download from [git-scm.com](https://git-scm.com/download/win) and run the installer.
   - **macOS**: `brew install git` or download from the Git website.
   - **Linux**: Use your package manager (e.g. `sudo apt install git`).

2. Open a terminal or command prompt and run:
   ```bash
   git clone https://github.com/<your-username>/hangman.git
   cd hangman/demo
   ```
   Replace `<your-username>` with your GitHub username or the organization name if the project is hosted elsewhere.

## ☁️ Setting Up GitHub

- Create a GitHub account at [github.com](https://github.com) if you don't already have one.
- Fork or create a repository named `hangman` and push your local code to GitHub:
  ```bash
  git remote add origin https://github.com/<your-username>/hangman.git
  git branch -M main
  git push -u origin main
  ```

## 🛠 Prerequisites

Before running the application, make sure you have the following installed:

- **Java Development Kit (JDK) 17 or higher**
  - Download from [Adoptium](https://adoptium.net/) or Oracle.
  - Verify installation with `java -version` and `javac -version`.

- **Maven (optional)**
  - The project includes the Maven wrapper (`mvnw`/`mvnw.cmd`) so you don’t need a global Maven installation.

## 🚀 Running the Project

1. Open a terminal in the `demo` directory.
2. Build and start the app using the Maven wrapper:
   ```bash
   ./mvnw spring-boot:run    # macOS/Linux
   mvnw.cmd spring-boot:run  # Windows
   ```
3. Once the application starts, open a web browser and navigate to:
   `http://localhost:8080`

## 🧪 Running Tests

Execute unit tests with:
```bash
./mvnw test      # macOS/Linux
mvnw.cmd test    # Windows
```

## 📝 Project Structure

```
demo/
├─ mvnw, mvnw.cmd    # Maven wrappers
├─ pom.xml           # Maven configuration
└─ src/
   ├─ main/java      # Java source code
   └─ main/resources # Application properties and templates
```

## ✨ Tips & Links

- Edit `src/main/resources/templates` to modify HTML views.
- Manage application settings in `application.properties`.

## 📄 License

Add licensing information here if applicable.
