package com.redamessoudi.optimizedSBDimage.models;

/**
 * @author Reda Messoudi
 */
public class Player {

  private String team;
  private String position;
  private int number;

  public Player() {
  }

  public Player(String team, String position, int number) {
    this.team = team;
    this.position = position;
    this.number = number;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
