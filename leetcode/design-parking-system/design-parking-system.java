/**
 * Title: design-parking-system
 * Slug: design-parking-system
 * URL: https://leetcode.com/problems/design-parking-system/?envType=problem-list-v2&envId=design
 * Language: java
 * Submitted: 2025-10-24T16:47:59.077Z
 */

class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            }
        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
        } else if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            }
        }
        return false;
    }
}
