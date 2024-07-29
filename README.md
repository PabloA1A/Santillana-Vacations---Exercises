# Santillana Vacations - Exercises

## Requirements:

All exercises must be done using JAVA.
All exercises must have their unit tests
All exercises must have their class diagrams.

### Exercise 1: 

#### Months and days

Statement:
Make a program that, given the number of a month (1,2,3,3,4...12), presents the name of the month and determines the number of days it has.

##### My diagram of the exercise made with https://app.diagrams.net/:
![My diagram](<Captura de pantalla 2024-07-12 a las 23.08.23.png>)

### Exercise 2:

#### Common elements

- Statement:
Develop a program that searches for common elements in two arrays of integers.

##### My diagram of the exercise made with https://app.diagrams.net/:
![My diagram](<Captura de pantalla 2024-07-13 a las 16.55.31.png>)

### Exercise 3:

#### Amstrong

- Statement:
You want to develop a program that determines whether a number is an Amstrong number. An Amstrong number is one that is equal to the sum of its digits raised to the power of its number of digits.

- For example, the number 371 is an Amstrong number since it has three digits and:
371 = 33 + 73 + 13 = 27 + 343 + 1 = 371

##### My diagram of the exercise made with https://app.diagrams.net/:
![My diagram](<Captura de pantalla 2024-07-13 a las 18.04.38.png>)

### Exercise 4:

#### Automobile

- Statement:
A program that models the concept of an automobile is required. An automobile has the following attributes:
Make: the name of the manufacturer.
Model: year of manufacture.
Engine: volume in liters of the engine displacement of an automobile.
Fuel type: value listed with the possible values of gasoline, bioethanol, diesel, biodiesel, natural gas.
Type of car: value listed with the possible values of city car, subcompact, compact, family, executive, SUV.
Number of doors: number of doors.
Number of seats: number of seats available in the vehicle.
vehicle has.
Maximum speed: maximum speed sustained by the vehicle in km/h.
Color: value listed with the possible values of white, black, red, orange, yellow, green, blue, violet.
Current speed: speed of the vehicle at a given time.

- The class must include the following methods:
A constructor for the Automobile class where the values of its attributes are passed as parameters.
Get and set methods for the Automobile class.
Methods to accelerate to a certain speed, decelerate and brake (set the current speed to zero). It is important to note that it is not allowed to accelerate beyond the maximum speed allowed for the car. Likewise, it is not possible to decelerate to a negative speed. If these cases are fulfilled, the corresponding messages should be displayed on the screen.
A method for calculating the estimated time of arrival, using the distance to be traveled in kilometers as a parameter. The estimated time is calculated as the quotient between the distance to travel and the current speed.
A method to show the values of the attributes of a car on the screen.
A main method where you create a car, set its current speed to 100 km/h, increase its speed by 20 km/h, then decrease its speed by 50 km/h, and then brake. With each speed change, the current speed should be displayed on the screen.

- High police: :
Add to the Automobile class, an attribute to determine if the vehicle is automatic or not. Add the methods get and set for this attribute. Modify the constructor to initialize this attribute.
Modify the accelerate method so that if the maximum speed is exceeded a fine is generated. This fine can be increased each time the vehicle tries to exceed the maximum speed allowed.
Add a method to determine if a vehicle has fines and another method to determine the total value of fines of a vehicle.

##### My diagram of the exercise made with https://app.diagrams.net/:
![My diagram](<Captura de pantalla 2024-07-13 a las 19.32.41.png>)