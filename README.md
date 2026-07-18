# Intergalactic Space Fleet System 

## Overview
This project is an Object-Oriented Programming (OOP) exercise in Java. It simulates a space fleet assignment system where astronauts are assigned to specific missions based on their experience, specialty, and mission-specific constraints. 

## System Rules & Features
* **Encapsulation:** All attributes of the `Mission` class are strictly private.
* **Dynamic Constraints:** Each mission defines its own minimum experience requirement, maximum crew capacity, and base hazard pay.
* **ID Generation:** Astronauts generate a unique ID upon creation (Format: `Astro-[Name]-[Specialty]`).
* **Specialty Defaults:** If an astronaut is registered without a specialty, it defaults to `"Generalist"`.
* **Priority Overrides:** 
  * **Medics:** Critical for survival, Medics bypass the minimum experience requirement for any mission.
  * **Veterans:** Astronauts with the `"Veteran"` rank receive an additional $500.00 hazard pay bonus.
* **State & Static Tracking:** 
  * Astronauts cannot be assigned to more than one mission.
  * A static counter tracks the total number of successfully assigned astronauts across the entire fleet.

## Project Structure
* `Mission.java`: Manages mission details, capacity limits, and stores the array of assigned astronauts.
* `Astronaut.java`: Manages astronaut profiles, applies the core assignment logic, enforces constraints, and calculates pay bonuses.
* `FleetTester.java`: The main driver class that initializes the objects and tests the system's logic against expected edge cases.

## How to Compile and Run

1. Ensure you have the Java Development Kit (JDK) installed on your machine.
2. Save the three Java files (`Mission.java`, `Astronaut.java`, `FleetTester.java`) in the exact same directory.
3. Open your terminal or command prompt and navigate to that directory.
4. Compile all the Java files at once using:
   ```bash
   javac *.java
