
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length == 7) {
            return birdsPerDay[6];
        } else {
            return 0;
        }
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] = birdsPerDay[6] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdCount:birdsPerDay) {
            if (birdCount == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        if (birdsPerDay.length < numberOfDays) {
            for (int b = 0; b < birdsPerDay.length; b++) {
                total += birdsPerDay[b];
            }
        } else {
            for (int i = 0; i < numberOfDays; i++) {
                total += birdsPerDay[i];
            }
        }
        return total;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birdCount:birdsPerDay) {
            if (birdCount >= 5) {
                busyDays += 1;
            }
        }
        return busyDays;
    }
}
