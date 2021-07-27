# Java Trader Joe Assessment

Joe is a stock trader. His goal is to make as much money as possible. To do this, he hopes to buy and sell stocks in such a way to make a profit!

## Directions

1. Create a class named cd.rr.trader.StockPortfolio. It should have the following attributes and methods:
    
    ### Attributes
        value -> an attribute of type double that holds the value of the portfolio
        transferFee -> a static attribute set initially to $10 that is removed from the value with every transfer
        
    ### Methods
        getValue() -> should return the value of the portfolio
        transfer(amount) -> should add the provided amount, which could be negative or positive, to the value
        applyChange(percentage) -> should increase/decrease the value by the percentage provided i.e. $100 with -20% change => $80

2. Perform the following steps in `main()`
    
    1. Create a new portfolio
    1. Transfer an initial $100 into the portfolio
    1. Deposit $120 more dollars into the portfolio
    1. Apply a change of 5% to the portfolio
    1. Withdraw all the money in the portfolio.
    1. Apply a change of -10% to the portfolio
    1. Deposit all the money back into the portfolio
    1. Apply a change of 5% to the portfolio
    1. Withdraw all the money back out
    
    If Joe started with 220 dollars, what was his profit at the end?
    
## Submission

Push you solution to your GitHub repo
    
  
                
    
