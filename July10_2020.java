// Flatten the double link list - traverse next until node has child.


class Solution {
    public Node flatten(Node head) {
        
       Stack<Node> stack = new Stack<>();
         
        Node node = head, next = null;
        while(node != null){
             
            if(node.child != null){ 
                // setting next to stack
                if(node.next != null){
                    next = node.next;
                    next.prev = null;
                    stack.push(next);  
                }                              
                // setting child to list
                node.next = node.child;
                node.next.prev = node;
                node.child = null;
            }
             
            if(node.next == null && stack.size() > 0){
                next = stack.pop();
                node.next = next;
                next.prev = node;                
            }            
            node = node.next;
        }        
        return head;
        
    }
}
