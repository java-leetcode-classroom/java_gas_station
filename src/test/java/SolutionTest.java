import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void canCompleteCircuitExamples1() {
    assertEquals(3, sol.canCompleteCircuit(
        new int[]{1,2,3,4,5},
        new int[]{3,4,5,1,2}
    ));
  }
  @Test
  void canCompleteCircuitExamples2() {
    assertEquals(-1, sol.canCompleteCircuit(
        new int[]{2,3,4},
        new int[]{3,4,3}
    ));
  }
}