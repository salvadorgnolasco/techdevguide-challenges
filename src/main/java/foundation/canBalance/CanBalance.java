/* ------------------------------------------------------------------------------------------------
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * ------------------------------------------------------------------------------------------------
 * Original Author: Salvador Gonzalez N.
 * Creation Date: Jul 8, 2018
 * ------------------------------------------------------------------------------------------------
 */

package foundation.canBalance;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

/**
 * <code>CanBalance</code>.
 *
 * @author salvador.gonzalez
 * @version 1.0
 */
public class CanBalance {

  /**
   * Can balance.
   *
   * @param nums nums
   * @return true, if the condition is satisfied.
   */
  public boolean canBalance(int[] nums) {

    ArrayList<Integer> input = new ArrayList<>(nums.length);
    
    for (int num : nums) {
      input.add(num);
    }

    IntSummaryStatistics stats = input.stream().collect(Collectors.summarizingInt(n -> n));

    if (stats.getCount() <= 1 || stats.getSum() % 2 != 0) { 
      return false; 
    }

    int sum = 0;
    long half = (stats.getSum() / 2);

    for (int value : input) {
      sum += value;
      if (sum == half) {
        return true;
      } else if (sum > half) {
        break;
      }
    }

    return false;
  }
}
