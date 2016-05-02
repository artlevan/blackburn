{-# LANGUAGE ImplicitParams #-}
import Debug.Trace

isEven x
    | x `mod` 2 == 0 = True
    | otherwise = False

isOdd x
    | isEven x == False = True
    | otherwise = False

increment x
    = x + 1

decrement x
    = x - 1

count x
    | null x == True = 0
    | otherwise = 1 + count (tail x)


sumal x
    | null x == True = 0
    | otherwise = (head x) + (sumal (tail x))

productal x
    | null x == True = 0
    | otherwise = (head x) * (product (tail x))

evensToal x
    | (isEven x) == True = x:(evensToal (decrement x))
    | x > 0 = (evensToal (decrement x))
    | otherwise = []

oddsToal x
    | (isOdd x) == True = x:(oddsToal (decrement x))
    | x > 0 = (oddsToal (decrement x))
    | otherwise = []

evensal x
    | null x == True = []
    | isEven (head x) == True = head x:(evensal (tail x))
    | otherwise = (evensal (tail x))

oddsal x
    | null x == True = []
    | isOdd (head x) == True = head x:(oddsal (tail x))
    | otherwise = (oddsal (tail x))

isPrime x
    | null [ y | y <- [2..(decrement x)], x `mod` y == 0] == True = True
    | otherwise = False
    
nextPrime x
    | isPrime (increment x) == True = increment x
    | otherwise = nextPrime (increment x)

primes x
    | x < 0 = []
    | (isPrime x) == True = x:(primes (decrement x))
    | x > 0 = (primes (decrement x))
    | otherwise = []


primesTo x 
    | isPrime (decrement x) == True = decrement x
    | otherwise = nextPrime (decrement x)

selectPrimes x
    | null x == True = []
    | isPrime (head x) == True = head x:(selectPrimes (tail x))
    | otherwise = (selectPrimes (tail x))