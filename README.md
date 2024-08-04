# ATM Simulation

This Java program simulates an ATM machine, allowing users to interact with a bank account. Users can withdraw, deposit, and check their balance through a simple console interface.

## Features

- **Withdraw Money**: Withdraw a specified amount from the account balance.
- **Deposit Money**: Deposit a specified amount into the account.
- **Check Balance**: Display the current account balance.

## How to Use

1. **Initialize the Program**:
   - The program initializes with a default balance in the bank account (e.g., ₹100,000.0).

2. **ATM Menu**:
   - The user is presented with a menu of options:
     ```
     ===============================================
     |                                             |
     |             Welcome to the ATM              |
     |                                             |
     ===============================================
     | Options:                                    |
     | 1. Withdraw                                 |
     | 2. Deposit                                  |
     | 3. Check Balance                            |
     | 0. Exit                                     |
     ===============================================
     ```

3. **Select an Option**:
   - **Withdraw**: Enter the amount you want to withdraw. The program will check if the amount is valid and if there are sufficient funds.
   - **Deposit**: Enter the amount you want to deposit. The program will check if the amount is valid.
   - **Check Balance**: View the current account balance.
   - **Exit**: Exit the program.

4. **Repeat**:
   - After completing an action, the menu will be displayed again for further transactions.

## Example

```
===============================================
|                                             |
|             Welcome to the ATM              |
|                                             |
===============================================
| Options:                                    |
| 1. Withdraw                                 |
| 2. Deposit                                  |
| 3. Check Balance                            |
| 0. Exit                                     |
===============================================
Please choose an option: 1
Enter amount to withdraw: ₹5000
Withdrawal successful. New balance: ₹95000.00

===============================================
|                                             |
|             Welcome to the ATM              |
|                                             |
===============================================
| Options:                                    |
| 1. Withdraw                                 |
| 2. Deposit                                  |
| 3. Check Balance                            |
| 0. Exit                                     |
===============================================
Please choose an option: 3
Your current balance: ₹95000.00
```

## Prerequisites

- Java JDK installed on your machine.

## Running the Program

1. Compile the Java code:

   ```sh
   javac Main.java
   ```

2. Run the compiled program:

   ```sh
   java Main
   ```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## Author

- [Mayank Wadhwa](https://github.com/MmayankK21)

---

Feel free to customize this README file according to your needs!
