package assignment1;

import java.util.*;

public class TransferFinder {

    /**
     * @require The depot is non-null and contains exactly one item of a
     *          particular type. The depot may not contain any items of any
     *          other type and has a capacity of one. The set of warehouses is
     *          not null, does not contain null warehouses, and does not include
     *          the depot.
     * 
     * @ensure The state of the depot, and each of the warehouses in the given
     *         set must not NOT be modified in any way (e.g. items should not be
     *         added or removed from the depot or any of these warehouses).
     * 
     *         This method should return either:
     * 
     *         (a) a non-null list of transfers such that (i) each transfer is
     *         non-null and takes place either between two warehouses in the
     *         given set of warehouses, or between the given depot and a
     *         warehouse in the set of warehouses; (ii) given the initial state
     *         of the depot and warehouses, all the transfers can be performed
     *         in the order in which they appear in the list; and (iii) the
     *         depot is empty when all transfers in the list are completed (in
     *         order, starting from the initial state of the depot and
     *         warehouses).
     * 
     *         OR
     * 
     *         (b) the value null if and only if no such list of transfers, as
     *         described in part (a), exists.
     * 
     *         (See the assignment handout for details and examples.)
     */
    public static List<Transfer> findTransfers(Warehouse depot,
            Set<Warehouse> warehouses) {
        WarehouseManager warehouseManager = new WarehouseManager(warehouses);
        return warehouseManager.BFS(depot);
    }
}
