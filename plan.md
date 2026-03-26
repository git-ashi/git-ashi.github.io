# Portfolio Plan: Ashish Kumar - Kobweb Portfolio

## Overview
Build a modern, glassmorphism-styled portfolio website using **Kobweb** (Kotlin/Compose HTML) to showcase your 7.5+ years of Android development experience and provide a downloadable resume.

**Goal:** Transition from Android to fullstack by learning web development with familiar Kotlin/Compose syntax.

---

## Technology Stack

| Component | Technology | Purpose |
|-----------|------------|---------|
| Framework | Kobweb | Compose HTML for Kotlin |
| Language | Kotlin | Single language for web |
| Build Tool | Gradle (Kotlin DSL) | Project build & dependency management |
| Styling | CSS via `CSSBuilder` | Glassmorphism effects, responsive design |
| Deployment | GitHub Pages | Free static hosting |

---

## Design System

### Color Palette
| Name | Hex | Usage |
|------|-----|-------|
| Android Green | `#3DDC84` | Primary accent, highlights |
| Deep Black | `#000000` | Background base |
| Dark Gray | `#1A1A1A` | Card backgrounds |
| Glass White | `rgba(255,255,255,0.1)` | Glass overlay |
| Border White | `rgba(255,255,255,0.2)` | Glass borders |
| Text White | `#FFFFFF` | Primary text |
| Text Gray | `#B0B0B0` | Secondary text |

### Glassmorphism Effects
```kotlin
object GlassStyles {
    val glassCard = CSSBuilder {
        backgroundColor = rgba(255, 255, 255, 0.08)
        backdropFilter = Blur(15.px)
        border(1.px, LineStyle.Solid, rgba(255, 255, 255, 0.15))
        borderRadius = 16.px
        boxShadow(Blur(25.px), Color.Black)
    }
}
```

### Typography
- **Headings:** Sans-serif (system default or Google Fonts)
- **Body:** 16px base, clean readable line height

---

## Project Structure

```
/
├── build.gradle.kts          # Kobweb config, dependencies
├── settings.gradle.kts       # Project settings
├── .gitignore
├── plan.md                   # This file
├── resume.pdf                # Existing resume (copied)
└── src/
    └── commonMain/
        └── kotlin/
            └── com/ashishkumar/portfolio/
                ├── Main.kt              # Entry point (@app)
                ├── pages/
                │   └── Index.kt         # Main page
                ├── components/
                │   ├── GlassCard.kt     # Reusable glass card
                │   ├── SkillChip.kt      # Skill badges
                │   └── ProjectCard.kt    # Project showcase
                ├── sections/
                │   ├── Hero.kt          # Name, title, CTA
                │   ├── About.kt          # Experience summary
                │   ├── Experience.kt     # Work history timeline
                │   ├── Projects.kt       # App showcase
                │   ├── Skills.kt         # Tech stack grid
                │   ├── Education.kt       # Academic background
                │   └── Contact.kt        # LinkedIn, Email, Phone
                └── style/
                    ├── Colors.kt         # Color constants
                    └── GlassStyles.kt    # Glassmorphism styles
```

---

## Page Sections

### 1. Hero Section
- Large name display: "Ashish Kumar"
- Title: "Android Developer • 7.5+ Years Experience"
- Subtitle/tagline
- CTA buttons: "View Projects" (scroll), "Download Resume"
- Animated gradient background

### 2. About Section
- Brief professional summary (from resume)
- Glass card with key highlights

### 3. Experience Section
Timeline-style layout:
- **Horigine Consulting** (May–Dec 2024) — Bengaluru
- **TechAhead** (Jan 2017–Apr 2021, Aug 2021–Feb 2024) — Noida

### 4. Projects Section
Cards with links from resume:
| Project | Link |
|---------|------|
| HyreCar App | Google Play |
| Parental Control App | Google Play |
| Tada | Google Play |
| SB Answer | Google Play |
| Healthy Mummy | Google Play |
| Baaz | Google Play |
| Trade V | Google Play |
| Day Pro | Google Play |

### 5. Skills Section
Grid of skill chips/categories:
- **Languages:** Kotlin, Java, Dart, Python, C#, C++
- **Mobile:** Android SDK, Flutter
- **Backend:** GraphQL, REST APIs
- **Database:** Room, SQLite
- **Tools:** Git, Firebase, CI/CD, JIRA
- **Libraries:** Retrofit, Dagger, Koin

### 6. Education Section
- B.Tech Computer Science — RJPIEMIT (2017)
- AISSCE — Kendriya Vidyalaya No. 2 (2012)
- AISSE — Kendriya Vidyalaya No. 2 (2010)

### 7. Contact Section
- LinkedIn
- Email: ashishk17395@gmail.com
- Phone: 9996869554
- "Download Resume" button (links to `/resume.pdf`)

---

## Components Library

### GlassCard
Reusable container with glassmorphism styling:
```kotlin
@Composable
fun GlassCard(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
)
```

### SkillChip
Styled tag for individual skills:
```kotlin
@Composable
fun SkillChip(skill: String)
```

### ProjectCard
Card for project showcase with optional link:
```kotlin
@Composable
fun ProjectCard(
    title: String,
    description: String,
    link: String? = null
)
```

---

## GitHub Pages Deployment

### Build Output
Kobweb outputs static files to `/build/dist/`

### Deployment Steps
1. Configure `base` path in `kobweb.conf` to `/git-ashi.github.io/`
2. Build: `gradle kobwebBuild`
3. Copy contents of `build/dist/` to repository root
4. GitHub Pages serves from root automatically

---

## Implementation Phases

### Phase 1: Project Setup ✓
- [x] Initialize Kobweb project with Gradle
- [x] Configure dependencies
- [x] Set up folder structure

### Phase 2: Design System
- [ ] Create Colors.kt
- [ ] Create GlassStyles.kt
- [ ] Create GlassCard component

### Phase 3: Page Structure
- [ ] Create Main.kt entry point
- [ ] Create Index.kt with sections

### Phase 4: Section Implementation
- [ ] Hero section
- [ ] About section
- [ ] Experience section
- [ ] Projects section (with links)
- [ ] Skills section
- [ ] Education section
- [ ] Contact section

### Phase 5: Deployment
- [ ] Configure base path
- [ ] Build production bundle
- [ ] Deploy to GitHub Pages

---

## Notes & Future Enhancements
- **GitHub link** can be added later to Contact section
- **Contact form** (backend API) can be added when ready for fullstack
- **Dark/Light toggle** can be added as enhancement
