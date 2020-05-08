# Software Configuration Management #

## Extension of the exercise Drinks template with subclasses ###

...
The goal of this exercise is to train how to implement Unit Tests. Therefore we have to extend the given template *Drinks* and derive a subclass from the class *Drinks/SimpleDrink*. We will name it **AppleJuice.java**. 
We will use the following collections:
* java.util.ArrayList;
* java.util.List;

We will create Unit Tests for the functionality of *SimpleDrink* 
and try to get a 100% successful test covering. 

To all methods we will add JavaDoc comments. 

Further we will implement an *exception* for the AppleJuice.java class which in case of volume smaller or equal zero will be thrown: 

```java
 private void checkVolume(String name, double volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("liquid " + name + " must have a volume > 0");
        }
    }
```

Also our task is to experiment with the this ReadMe file and with the Markdown elements (for example we added a gif and used a variety of formatting examples).
![](https://media.giphy.com/media/xTiQytOEqr2U33lYkg/giphy.gif)