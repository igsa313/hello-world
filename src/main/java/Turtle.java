class Turtle extends Animal {
    public String getAnimalSound() {
        return "The turtle says: oop";
    }

    public int averageMilisecondsLived;
    public int size;
    public int color;
    public int getAverageMilisecondsLived() {
        return averageMilisecondsLived;
    }

    public void setAverageMilisecondsLived(int averageMilisecondsLived) {
        this.averageMilisecondsLived = averageMilisecondsLived;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    class shell{
        public int color;
        public String hardness;
        public String size;
        public shell (int color, String hardness, String size){
            this.color = color;
            this.hardness = hardness;
            this.size = size;
        }
        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }
        public String getHardness() {
            return hardness;
        }

        public void setColor(String hardness) {
            this.hardness = hardness;
        }
        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String toString() {
            return "Turtle{" +
                    "color='" + color + '\'' +
                    ", hardness=" + hardness +
                    ", size=" + size +
            '}';
        }
    }

}
