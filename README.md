# App 
The Application Domain:
Prepare some classes to support statistical analyses of hockey players in a hypothetical 'team'.
This could be used for hockey fantasy leagues.
The Data:
A Team is a Goaltender and a collection of Skaters. (A Skater is a hockey player that is not a
goaltender.) It also includes a Coach.
An Employee is a generic (abstract) class to represent the common characteristics of the Team's
employees, coach and players. Every Employee has a name, a salary, career games, and years in
hockey.
A Player is another generic (abstract) class to represent the common career statistics of all hockey
players (in addition to those characteristics shared by all employees). Goaltenders and Skaters
have different statistics, but one that is shared is the number of minutes played over their career.
All Players have a jersey number too.
A Goaltender is a class to collect goaltending statistics. There are many, but to keep things simple
for this assignment, we will choose these four: goals against, saves, wins, and shutouts.
A Skater is a class to collect offensive statistics. Again, there are an enormous variety of statistics,
but we will choose just two: goals and assists.
A Coach represents the person who is the manager on the bench. Besides the properties inherited
from the Employee class, add this statistic: career wins.
Object Interface and Implementation:
In summary, there are six classes: Team, Employee, Player, Skater, Goaltender, and Coach. Player
and Coach are subclasses of Employee. Skater and Goaltender are subclasses of Player. Employee
and Player are 'abstract' classes; each Employee is either a Coach or a Player, and each Player is
either a Skater or a Goaltender,
For member functions, each class must have a constructor that initializes all the data members of
an instance, and a 'toString' method that produces a String summarizing the data members of the
instance. (Remeber to include the inherited data members.) Each class must also have an
accessor method for each data member. (Remember that the subclasses inherit the accessor
methods of the parent class.) The only exception is that there will be no accessor to return the list
of Skaters on a Team.
