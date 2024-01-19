# JavaFX Game
## My JavaFX Game Application Report

### Overview:

The JavaFX Game Application is a two-player game with characters and a scoring system. I designed this application using JavaFX to create a graphical user interface.

### Components:

1. Player Objects:

I created the Player_Objects class with methods to generate game elements like background, player characters, goal posts, and scoring texts.
Elements include images, rectangles, circles, and texts for the visual representation of the game.
2. Main Application Class (Main):

The Main class is the entry point for my JavaFX application.
I set up the application window with a border pane, adding game elements to the scene.
User input via keyboard events (W, A, S, D, arrow keys) controls character movement.
A scoring system tracks scores for each player.
3. Game Manager (GameManager):

The GameManager class manages game logic, including collision detection and scoring.
I call the method to handle specific aspects of game mechanics.
4. Obstacles Class (Obstacles):

The Obstacles class in the application package is present but not utilized within the application.
5. Player Class (Player):

The Player class in the game.model package defines a player with a name, password, and high score.
Getter and setter methods enable access and modification of player information.
### Functionality:

Movement:

Players can control characters using the W, A, S, and D keys for one player and arrow keys for the other player.
Scoring:

The game includes a scoring system where players gain points by moving an object (circle) into specific regions (goal posts).
The game stops when one of the players reaches a predefined score threshold (5 in this case).
Winning:

If a player reaches the winning score, a message is displayed, and the game can be restarted by clicking on a "Restart Game" text.
### Recommendations:

Obstacles Integration:

The Obstacles class is present but not currently integrated into the game. I could consider incorporating obstacles to add complexity and challenge.
Code Structure:

I could organize the code into more modular components and classes, adhering to best practices for maintainability and readability.
Enhancements:

Exploring additional features, such as levels, power-ups, or improved graphics, could enhance the gaming experience.
### Conclusion:

My JavaFX Game Application provides a basic two-player gaming experience with scoring mechanics. With further enhancements and refinements, it has the potential to become a more engaging and feature-rich game, which I intend to do once my school ends this summer.
