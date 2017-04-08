/**
* Created by Rehan Samarasekera on 4/2/2017. [2015065] [w1583026]
 */
class NodeClass {
        int len_X;
        int len_Y;
        double distance = Integer.MAX_VALUE;
        NodeClass parent = null;
        boolean visited;
        boolean blocked;

        public NodeClass(int x, int y) {
            this.len_X= x;
            this.len_Y = y;
        }
       
    }