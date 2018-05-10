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
                }
                else{           //If we don't have a value, we add it there and exit the function
                    pointer.right=node;
                    return this;
                }
            }
            else{           
                if(pointer.left){
                    pointer=pointer.left;
                }
                else{
                    pointer.left=node;
                    return this;
                }
            }
        }
    }

    this.min=function(){
        var pointer=this.root;
        while(pointer.left){   
            pointer=pointer.left;
        }
        return pointer.val;
    }

    this.max=function(){
        var pointer=this.root;
        if(this.isEmpty()){
            return null;
        }
        else{
            while(pointer.right){   
                pointer=pointer.right;
            }
            return pointer.val;
        }
    }
    this.isEmpty=function(){
        if(this.root==null){
            return true;
        }
        return false;
    }
    this.contains=function(val){
        var pointer=this.root;
        while(pointer){   
            if(val>pointer.val){  
                pointer=pointer.right;
            }
            else if(val<pointer.val){         
                pointer=pointer.left;
            }
            else if(pointer.val==val){
                return true;
            }
        }
        return false;
    }

    this.height=function(pointer = this.root){
        var right=0,left=0;
        if(!pointer){
            return 0;
        }
        if(pointer.right){
            right=1+this.height(pointer.right);
        }
        if(pointer.left){
            left=1+this.height(pointer.left);
        }
        if(left>right){
            return left;
        }
        else{
            return right;
        }
    }
}


var tree= new BST();
tree.add(20);
tree.add(12);
tree.add(8);
tree.add(10);

console.log(tree.height());

// console.log(tree.min());
// console.log(tree.max());
// console.log(tree.isEmpty());
// console.log(tree.contains(20));
// console.log(tree);