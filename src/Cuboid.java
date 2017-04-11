
public class Cuboid {

  int sideA;
  int sideB;
  int sideC;

  public static void main(String[] args) {
    System.out.println(getSurface(3, 2, 4));
    System.out.println(getVolume(3, 2, 4));
  }

  public Cuboid(int sideA, int sideB, int sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  public static int getSurface(int sideA, int sideB, int sideC) {
    int s1 = sideA * sideB * 2;
    int s2 = sideA * sideC * 2;
    int s3 = sideB * sideC * 2;
    int surface = s1 + s2 + s3;
    return surface;
  }

  public static int getVolume(int sideA, int sideB, int sideC) {
    int volume = sideA * sideB * sideC;
    return volume;
  }
}
