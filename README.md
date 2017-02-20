# ForASG
Completion of the first half of a technical test.

This is the beginning of the design of a Roulette system.

The project requires Maven ~3.0.x be installed. The project is also developed/tested on a Linux platform using the openjdk-9-jdk package, so some POM dependency version numbers might need to be 'tweaked' on non-Unix systems.

As this is not intended to ever be a finished project, one need only the command:
```
mvn test -q
```
Which will run the appropriate test scripts.

A pretty picture
```
.
├── instructions.txt
├── LICENSE
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── forASG
    │           └── roulette
    │               ├── Bet.java
    │               ├── Customer.java
    │               ├── Pocket.java
    │               ├── RouletteGameException.java
    │               └── Table.java
    └── test
        ├── java
        │   └── forASG
        │       └── roulette
        │           ├── coverage
        │           │   └── CustomerTests.java
        │           ├── integration
        │           │   ├── Stage1.java
        │           │   └── Stage2.java
        │           └── TestRunner.java
        └── resources
            └── forASG
                └── roulette
                    ├── coverage
                    │   └── bet.feature
                    └── integration
                        ├── stage_1.feature
                        └── stage_2.feature

```
