/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

public class MyAlgorithm extends matrixmap.Algorithm {

  @Override
    public boolean running() {
        if (car != null) {
        int carRow = car.getRowPosition();
            int carCol = car.getColPosition();
            if (carRow == destRow && carCol == destCol)
                return false;
            int heading = car.headed();

            if (carCol < destCol && carRow < destRow) {  // II-IV
                System.out.println("II-IV heading:" + heading);
                switch (heading) {
                    case EAST:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case SOUTH:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case NORTH:
                        if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(BEHIND))
                            car.turnRight();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        break;
                    case WEST: //Checked
                        if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(BEHIND))
                            car.turnLeft();
                        break;
                    default:
                        break;
                }
            } else if (carCol < destCol && carRow > destRow) { //III-I
                System.out.println("III-I heading:" + heading);
                switch (heading) {
                    case EAST:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(RIGHT))
                            car.turnRight();
                        else
                            car.turnLeft();
                        break;
                    case NORTH:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case SOUTH:
                        if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(BEHIND))
                            car.turnLeft();
                        else if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else
                            car.turnLeft();
                        break;
                    case WEST: //Checked
                        if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(BEHIND))
                            car.turnRight();
                        else
                            car.turnRight();
                        break;
                    default:
                        break;
                }
            } else if (carCol < destCol && carRow == destRow) { //II-I
                System.out.println("II-I heading:" + heading);
                switch (heading) {
                    case EAST:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case NORTH: //Check
                        if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(BEHIND))
                            car.turnRight();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        break;
                    case SOUTH:  //Checked
                        if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(BEHIND))
                            car.turnRight();
                        else
                            car.turnRight();
                        break;
                    case WEST:
                        if (car.sensing(BEHIND))
                            car.turnRight();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else
                            car.turnRight();
                        break;
                    default:
                        break;
                }
            } else if (carCol > destCol && carRow < destRow) { //I-III
                System.out.println("I-III heading:" + heading);
                switch (heading) {
                    case WEST:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case SOUTH:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case NORTH:
                        if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(BEHIND))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else
                            car.turnRight();
                        break;
                    case EAST:
                        if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(BEHIND))
                            car.turnRight();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else
                            car.turnRight();
                        break;
                    default:
                        break;
                }
            } else if (carCol > destCol && carRow > destRow) { //IV-II
                System.out.println("IV-II heading:" + heading);
                switch (heading) {
                    case WEST:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case NORTH:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case SOUTH: //Check
                        if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case EAST: //Check
                        if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(BEHIND))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else
                            car.turnRight();
                        break;
                    default:
                        break;
                }
            } else if (carCol > destCol && carRow == destRow) { //I-II
                System.out.println("I-II heading:" + heading);
                switch (heading) {
                    case WEST:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case SOUTH:
                        if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case NORTH:
                        if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else
                            car.turnRight();
                        break;
                    case EAST:
                        if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(BEHIND))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        break;
                    default:
                        break;
                }
            } else if (carCol == destCol && carRow < destRow) { //II-III
                System.out.println("II-III heading:" + heading);
                switch (heading) {
                    case SOUTH:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case NORTH: //Checked
                        if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(BEHIND))
                            car.turnRight();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        break;
                    case EAST:  //Check
                        if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(BEHIND))
                            car.turnRight();
                        break;
                    case WEST: // Check
                        if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else
                            car.turnRight();
                        break;
                    default:
                        break;
                }
            } else if (carCol == destCol && carRow > destRow) { //III-II
                System.out.println("III-II heading:" + heading);
                switch (heading) {
                    case NORTH:
                        if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    case SOUTH: //Checked    // Trouble
                        if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(BEHIND))
                            car.turnRight();
                        break;
                    case EAST: //Check
                        if (car.sensing(LEFT))
                            car.turnLeft();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(RIGHT))
                            car.turnRight();
                        else
                            car.turnRight();
                        break;
                    case WEST:  //check  //Trouble
                        if (car.sensing(RIGHT))
                            car.turnRight();
                        else if (car.sensing(AHEAD))
                            car.forward();
                        else if (car.sensing(LEFT))
                            car.turnLeft();
                        else
                            car.turnRight();
                        break;
                    default:
                        break;
                }
            }
            if (carRow > destRow) {
                if (!car.forward()) {
                    if (carCol > destCol)
                        car.turnLeft();
                    else
                        car.turnRight();
                }
                return true;
            } else {

            }
            return true;
        }
        return false;
    }

}