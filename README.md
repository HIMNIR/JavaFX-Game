# JavaFX-Game
## JavaFX Game Application Report

### Overview:

The JavaFX Game Application is designed as a two-player game with characters and a scoring system. The game is implemented using JavaFX to create a graphical user interface.

### Components:

1. Player Objects:

The Player_Objects class contains methods to create various game elements such as background, player characters, goal posts, and scoring texts.
Elements include images, rectangles, circles, and texts that contribute to the visual representation of the game.
2. Main Application Class (Main):

The Main class serves as the entry point for the JavaFX application.
The application window is set up with a border pane, and the game elements are added to the scene.
User input through keyboard events (arrow keys) controls the movement of two characters on the screen.
The scoring system keeps track of scores for each player.
3. Game Manager (GameManager):

The GameManager class appears to manage game logic, including collision detection and scoring.
The method method is called to handle some aspects of game mechanics.
4. Obstacles Class (Obstacles):

The Obstacles class in the application package is present but does not seem to be utilized within the application.
5. Player Class (Player):

The Player class in the game.model package defines a player with a name, password, and high score.
Getter and setter methods allow for accessing and modifying player information.
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

The Obstacles class is present but not currently integrated into the game. Consider incorporating obstacles to add complexity and challenge.
Code Structure:

Consider organizing the code into more modular components and classes, adhering to best practices for maintainability and readability.
Enhancements:

Explore adding additional features, such as levels, power-ups, or improved graphics, to enhance the gaming experience.
### Conclusion:

The JavaFX Game Application provides a basic two-player gaming experience with scoring mechanics. With further enhancements and refinements, it has the potential to become a more engaging and feature-rich game.
