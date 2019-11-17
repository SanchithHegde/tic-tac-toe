package me.sanchithhegde.tictactoe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class for a node in the tree.
 */
public class Node {
  State state;
  Node parent;
  List<Node> childArray;

  public Node() {
    this.state = new State();
    childArray = new ArrayList<Node>();
  }

  public Node(State state) {
    this.state = state;
    childArray = new ArrayList<Node>();
  }

  /**
   * Construct Node object given state, parent and childArray.
   * @param state State object.
   * @param parent Parent node.
   * @param childArray List of child nodes.
   */
  public Node(State state, Node parent, List<Node> childArray) {
    this.state = state;
    this.parent = parent;
    this.childArray = childArray;
  }

  /**
   * Clone a Node object.
   * @param node Node object to clone.
   */
  public Node(Node node) {
    this.childArray = new ArrayList<Node>();
    this.state = new State(node.getState());

    if (node.getParent() != null) {
      this.parent = node.getParent();
    }

    List<Node> childArray = node.getChildArray();

    for (Node child : childArray) {
      this.childArray.add(new Node(child));
    }
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public Node getParent() {
    return parent;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }

  public List<Node> getChildArray() {
    return childArray;
  }

  public void setChildArray(List<Node> childArray) {
    this.childArray = childArray;
  }
  
  /**
   * Selects a random child node from the available nodes.
   * @return Selected child node.
   */
  public Node getRandomChildNode() {
    int noOfPossibileMoves = this.childArray.size();
    int selectRandom = (int) (Math.random() * noOfPossibileMoves);
    return this.childArray.get(selectRandom);
  }

  /**
   * Selects child node that reduces the computer's chances of losing.
   * @return Child node with best score.
   */
  public Node getChildWithMaxScore() {
    return Collections.max(this.childArray, Comparator.comparing(c -> {
      return c.getState().getVisitCount();
    }));
  }
  
}