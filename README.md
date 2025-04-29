# DragonFlier

## Game Overview
DragonFlier is an interactive 2D game where players control a dragon flying through caverns to collect eggs. The game features strategic gameplay elements including egg ripening mechanics, hostile creatures, and fireball combat.

## Core Gameplay
- **Objective**: Collect eggs when they're ripe to earn points
- **Maximum Score**: 12 points (one for each hidden egg)
- **Challenge**: Find all eggs and determine the optimal collection order

## Game Mechanics

### Egg Collection
- Eggs begin as white
- When ripe (dark blue with red dot), they can be safely collected for points
- Collecting unripe eggs is poisonous and reduces player health
- If left too long, eggs hatch into hostile creatures

### Combat System
- Player can shoot fireballs to defeat creatures
- Fireball ability has a cooldown period
- During cooldown, only harmless smoke puffs are produced

## Controls
- **Movement**: Arrow keys to navigate the dragon
- **Attack**: Space bar to shoot fireballs
- **Instructions**: Press 'I' to toggle the instruction panel
- **Restart**: Press 'R' to restart the game

## Technical Implementation
The game is implemented in Java and features:
- Custom-built generic ArrayList implementation using linked lists
- Swing-based graphics rendering
- Timer-controlled game mechanics
- Dynamic text display with word wrapping

## Classes Overview
- **DragonFlier2**: Main game class
- **GamePane**: Handles game rendering and input
- **DragonGameShape**: Base class for game objects
- **MessageBox**: Displays instructions and game information
- **ArrayList**: Custom generic collection implementation
- Additional classes for eggs, creatures, and game mechanics

## Development Notes
- The game uses custom ArrayList implementations rather than Java's built-in ArrayList
- MessageBox dynamically positions itself based on dragon orientation
- Text display times are calculated based on average reading speed (250 words per minute)

## Getting Started
1. Compile all Java files
2. Run the DragonFlier2 class
3. Press 'I' to view game instructions
4. Use arrow keys to navigate and begin playing

## Project Extensions
This project demonstrates core game development concepts and can be extended with:
- Additional levels
- New creature types
- Power-ups and special abilities
- Score tracking and leaderboards
