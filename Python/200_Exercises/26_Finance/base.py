#Run "pip install yfinance" in a terminal

import yfinance as yf
list1 = ["A", "AA", "AACB", "AACG", "AAL", "AAM", "AAT", "AB", "ACI", "ACEL"]
a = 0
for a in range(0,10):
    stock = yf.Ticker(list1[a])
    current_price = stock.history(period="1d")["Close"][0]
    info = stock.info
    print(info["longName"])
    print(info["website"])
    print("Current Price:", current_price)
