//package RandomSearch;
//
//import org.junit.jupiter.api.Test;
//
//public class RandomSearch {
//    public static int randomSearch(Data[] data, int key) {
//        if (data.length == 0) {
//            return -1;
//        }
//        boolean[] visited = new boolean[data.length];
//        while (true) {
//            int index = (int) (Math.random() * data.length);
//            while (visited[index] && !allVisited(visited)) {
//                index = (int) (Math.random() * data.length);
//            }
//            if (data[index].getKey() == key) {
//                return index;
//            }
//            visited[index] = true;
//            if (allVisited(visited)) {
//                return -1;
//            }
//        }
//    }
//
//    private static boolean allVisited(boolean[] visited) {
//        for (boolean b : visited) {
//            if (!b) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    @Test
//    void test() {
//        Data[] data0 = new Data[] { };
//        Data[] data1 = new Data[] { new Data(1, "A") };
//        Data[] data3 = new Data[] { new Data(1, "A"), new Data(2, "B"), new Data(3, "C") };
//
//        assertEquals(-1, RandomSearch.randomSearch(data0, 0));
//
//        // hier Testfaelle einfuegen
//
//        assertEquals(0, RandomSearch.randomSearch(data1, 1));
//        assertEquals(1, RandomSearch.randomSearch(data3, 2));
//        assertEquals(-1, RandomSearch.randomSearch(data3, 4));
//    }
//}
