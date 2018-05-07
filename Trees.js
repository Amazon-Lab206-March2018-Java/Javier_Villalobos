function BTNode(val){
    this.val=val;
    this.left=null;
    this.right=null;
}

function BST(){
    this.root=null;


    this.add=function(val){
        node = new BTNode(val);
        if(!this.root){
            this.root=node;
            return this;
        }
        var pointer=this.root;
        while(pointer){   
            if(val>pointer.val){  //If the value is greater than the current node
                if(pointer.right){   //If we have a node in the right we move to it
                    pointer=pointer.right;
                    console.log("Moved Right " + pointer.val);
                }
                else{           //If we don't have a value, we add it there and exit the function
                    pointer.right=node;
                    console.log("Added Right " + val);
                    return this;
                }
            }
            else{           
                if(pointer.left){
                    pointer=pointer.left;
                    console.log("Moved Left " + pointer.val);
                }
                else{
                    pointer.left=node;
                    console.log("Added Left " + val);
                    return this;
                }
            }
        }
    }
}


var tree= new BST();
tree.add(12);
tree.add(8);
tree.add(10);
tree.add(9);
tree.add(11);
tree.add(13);
console.log(tree);