# Portfolio - Ashish Kumar

A modern, glassmorphism-styled portfolio website built with **Kobweb** (Kotlin/Compose HTML).

## Tech Stack

- **Kobweb** - Compose HTML framework for Kotlin
- **Gradle** - Build tool
- **GitHub Pages** - Deployment

## Prerequisites

- Java 17 or higher
- Node.js (for serving locally)

## Build Commands

```bash
# Install dependencies and generate Gradle wrapper
gradle wrapper

# Build the project
gradle kobwebBuild

# Preview locally (after build)
cd build/dist && npx serve
```

## Project Structure

```
src/commonMain/kotlin/com/ashishkumar/portfolio/
├── Main.kt              # Entry point
├── Index.kt             # Main page component
├── components/          # Reusable UI components
│   ├── GlassCard.kt
│   ├── ProjectCard.kt
│   └── SkillChip.kt
├── sections/            # Page sections
│   ├── Hero.kt
│   ├── About.kt
│   ├── Experience.kt
│   ├── Projects.kt
│   ├── Skills.kt
│   ├── Education.kt
│   └── Contact.kt
└── style/               # Design system
    ├── Colors.kt
    └── GlassStyles.kt
```

## Development

The project uses a dark theme with Android green (#3DDC84) accents and glassmorphism effects.

## Deployment

This site is deployed to GitHub Pages. The build output in `/build/dist/` is copied to the repository root for serving.

## Resume

The PDF resume is available at `/resume.pdf`.
