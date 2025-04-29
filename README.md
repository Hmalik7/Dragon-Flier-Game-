# 🐉 DragonFlier

## 🎮 Game Overview
DragonFlier is an immersive 2D adventure game where players control a dragon flying through mysterious caverns to collect eggs. This educational game project demonstrates core programming concepts including inheritance, timers, custom data structures, and interactive graphics.

## 🎯 Core Gameplay
- **Primary Objective**: Navigate caverns to collect eggs when they're perfectly ripe
- **Scoring System**: Each properly collected egg awards 1 point
- **Maximum Score**: 12 points (one for each strategically hidden egg)
- **Strategic Challenge**: Discover all eggs and determine the optimal collection sequence for maximum points

## 🔄 Game Mechanics

### 🥚 Egg Collection System
- **Initial State**: Eggs begin white (unripe)
- **Ripe State**: Dark blue with red dot - safe and valuable to collect (+1 point)
- **Unripe Collection**: Poisonous to the dragon, resulting in health reduction
- **Overripe State**: Eggs left too long will hatch into hostile creatures

### ⚔️ Combat Mechanics
- **Offensive Capability**: Dragon can shoot fireballs to defeat hostile creatures
- **Cooldown System**: Fireball ability requires recharge time between uses
- **Visual Feedback**: During cooldown, only harmless smoke puffs are produced
- **Strategic Element**: Players must time attacks carefully due to cooldown

### 🛡️ Health System
- Dragon has limited health displayed at the top of the screen
- Health decreases when collecting unripe eggs or being attacked by creatures
- Game ends when health reaches zero

## 🎛️ Controls
- **Movement**: ⬆️⬇️⬅️➡️ Arrow keys to navigate the dragon through caverns
- **Attack**: <kbd>Space</kbd> to shoot fireballs at creatures
- **Instructions**: <kbd>I</kbd> to toggle the instruction panel
- **Restart**: <kbd>R</kbd> to restart the game from the beginning

## 💻 Technical Implementation
The game is implemented in Java using object-oriented programming principles:

### 🧩 Architecture
- **Design Pattern**: Model-View-Controller pattern for game structure
- **Graphics Engine**: Java Swing for rendering game elements
- **Animation**: Timer-based animation for smooth movement
- **Custom Data Structures**: Hand-implemented generic ArrayList using linked lists

### 📚 Class Hierarchy
- **DragonFlier2**: Main application class containing game initialization
- **GamePane**: Core controller handling rendering, input, and game state
- **DragonGameShape**: Abstract base class for all visual game elements
  - **Dragon**: Player character with movement and attack capabilities
  - **Egg**: Dynamic objects with state changes and hatching behavior
  - **Creature**: Enemy entities with pursuit AI
  - **Fireball**: Projectile physics and collision detection
  - **MessageBox**: Dynamic text display with intelligent positioning
- **ArrayList\<T\>**: Custom generic collection implementation with linked list backing

### 🔧 Key Technical Features
- **Custom Text Rendering**: Intelligent word wrapping algorithm for message display
- **Dynamic Positioning**: MessageBox positions based on dragon orientation
- **Reading-Speed Calculations**: Text display duration calculated based on word count (250 WPM standard)
- **Event System**: Key bindings for responsive controls
- **Collision Detection**: Precise hit detection between game objects

## 🔍 Implementation Details

### MessageBox Class
The MessageBox extends DragonGameShape and provides:
- Dynamic text display with word wrapping
- Automatic positioning relative to the dragon's orientation
- Timed display based on message length (4 words/second)
- 5-pixel yellow border around black background for visibility
- Dimensions proportional to game window (⅓ width, 80% height)

### ArrayList Implementation
- Generic linked list implementation supporting type parameters
- Core methods: add(), get(), remove(), size(), isEmpty()
- Null handling and proper memory management
- Iterable interface implementation for enhanced usability

## 🚀 Getting Started
1. **Setup**: Ensure Java Development Kit (JDK) 8 or higher is installed
2. **Compilation**:
   ```bash
   javac *.java
   ```
3. **Execution**:
   ```bash
   java DragonFlier2
   ```
4. **Controls**: Press <kbd>I</kbd> immediately to view game instructions
5. **Gameplay**: Begin collecting eggs and exploring caverns

## 🧪 Testing
The game has been tested on Windows, macOS, and Linux environments with various screen resolutions. The custom ArrayList implementation includes comprehensive error handling and edge case management.

## 🔮 Project Extensions
This project demonstrates core game development concepts and can be extended with:
- Additional levels with increasing difficulty
- New creature types with unique behaviors
- Power-ups and special abilities
- Persistent high score tracking
- Sound effects and background music
- Particle effects for enhanced visual feedback
- Cross-platform deployment options

## 📝 Development Notes
- The game uses custom ArrayList implementations rather than Java's built-in ArrayList
- StringTokenizer is used for word counting and text processing
- Swing Timers control animation and timed events
- The project showcases inheritance, polymorphism, and encapsulation principles

## 👥 Contributors
Harsh Malik
