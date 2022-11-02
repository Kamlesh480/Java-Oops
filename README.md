# Java-Oops

In Java - which ever class/object you create it's parent will be Object(super parent) class
Java - multiple inheritence allow nahi karta hai, ek class ke multiple parents nahi ho sakte hain - Dymend problem - isisliye interfaces is there

MainClass contains :

1. Polimorphisum
2. constrcutor
3. overload constrcutor/using this() keyword
   Using this() keyword - you can call other constrcutor of your class, also userd to define values to the variable of same class, like this.age = age
4. static variable in class - property of class, does not depend on object
5. Interietnce
   Super key word: Use to call constrcutor of parent
   run time polimorphisum - again declaring a mothod with new defination, which is alredy available in parent class
6. Encapsulation
   Packages and access modifiers
   key public word agar nahi lagaya, to ye fun kahi or access nahi ho sakta
   key word Private: is class ke alava kahi nahi milega, not even in another file in same packege
   key word Protected: koi proerty parent ke pass hai, and you want ki vo sirf child ki mile
7. Abstrction - using abstrct keyword and interfaces
   Data hiding - to reduse complexity.
   Hide complexity from the user.
   Abstrct fun agar aapne banaya hai to - uski class ko bhi abstrct karna jaruri hain.
8. Abstrct VS interfaces
   interface ke under sabhi function bydeaful, public and abstract hote hain - to aap fun defination nahi add kar sakte
   but in abstrct aap funtion (which are without abstract key) unki defination add kar sakte ho, ex: status() fun in abstrction.java
   implements key word: classes ke liye hota hai extend vese hi interface ke liye hota hai - implements
