class Dog extends Animal {
    public String getAnimalSound() {
        return "The dog says: bark";
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
}
