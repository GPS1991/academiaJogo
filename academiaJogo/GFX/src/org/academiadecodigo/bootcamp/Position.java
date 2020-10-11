package org.academiadecodigo.bootcamp;

    public class Position {

        private double row;
        private double col;
        private double distance = 18.75;
        private Cadet cadet = new Cadet();


        public Position(double row, double col) {
            this.row = row;
            this.col = col;
        }

        public double getRow() {
            return row;
        }

        public double getCol() {
            return col;
        }


        public void moveDown(double distance) {
            if (this.row + distance < cadet.getMaxY()) {
                this.row += distance;
            } else {
                this.row = cadet.getMaxY() - 32;
            }
        }

        public void moveUp(double distance) {
            if (this.row - distance > 0) {
                this.row -= distance;
            } else {
                this.row = 0;
            }
        }

        public void moveLeft(double distance) {
            if (this.col - distance > 0) {
                this.col -= distance;
            } else {
                this.col = 0;
            }
        }

        public void moveRight(double distance) {

            if (this.col + distance < cadet.getMaxX()) {
                this.col += distance;
            } else {
                this.col = cadet.getMaxX() - 32;
            }
        }

        public void moveInDirection(Direction direction, double distance) {


            switch (direction) {

                case UP:
                    moveUp(distance);
                    break;
                case DOWN:
                    moveDown(distance);
                    break;
                case LEFT:
                    moveLeft(distance);
                    break;
                case RIGHT:
                    moveRight(distance);
                    break;
            }

        }



        public boolean isEdge(Direction direction) {

            return (direction == Direction.UP && row == 0) ||
                    (direction == Direction.DOWN && row == cadet.getMaxY() - 32) ||
                    (direction == Direction.LEFT && col == 0) ||
                    (direction == Direction.RIGHT && col == cadet.getMaxX() - 32);
        }

        /**
         * Tests for position equality
         * @param position The position to compare with
         * @return result of comparing positions
         */
        public boolean equals(Position position) {
            return col == position.getCol() &&
                    row == position.getRow();
        }

        @Override
        public String toString() {
            return "Position{" +
                    "row=" + row +
                    ", col=" + col +
                    '}';
        }
    }




