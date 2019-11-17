# Tic-Tac-Toe

Tic-Tac-Toe game using the Monte Carlo Tree Search algorithm, implemented in Java. 
The MCTS algorithm makes the computer almost impossible to beat, thus the worst case scenario (for the computer) would be a draw.

## Requirements

* Java (JDK and JRE)

## Compile and Run

```
# Compile all files
$ javac src/me/sanchithhegde/tictactoe/*.java -d target/classes 

# Execute driver class' main method
$ java -classpath target/classes me.sanchithhegde.tictactoe.App 
```

`target/classes` can be replaced with any directory of your choice. If you do change the output directory, make sure to specify the same directory when running the app.

## Board Positions

```
1 2 3
4 5 6
7 8 9
```

## Features

* Prints board with colored indicators (printing colors depends on terminal support).
  * Empty positions are shown as white hyphens '`-`'.
  * Player's indicators are shown with green `O`'s.
  * Computer's indicators are shown as red `X`'s.

## References

[Monte Carlo tree search - Wikipedia](https://en.wikipedia.org/wiki/Monte_Carlo_tree_search)

[Monte Carlo Tree Search for Tic-Tac-Toe Game - Baeldung](https://www.baeldung.com/java-monte-carlo-tree-search)

[eugenp/tutorials - GitHub](https://github.com/eugenp/tutorials/tree/master/algorithms-miscellaneous-1/src/main/java/com/baeldung/algorithms/mcts)

## Contributing

Feel free to submit pull requests or open issues.
Please ensure you follow [Google's Java Style Guide](https://google.github.io/styleguide/javaguide.html) when making pull requests.
Use [Checkstyle](https://github.com/checkstyle/checkstyle) with your editor if required.

## License 

[MIT](https://github.com/SanchithHegde/tic-tac-toe/blob/master/LICENSE.md)