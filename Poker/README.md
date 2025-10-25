A console-based simulation of Video Poker built in Java. Play a 5-card draw variant with betting (1–5 tokens), selective discards, and automatic hand scoring with payouts. Includes a deterministic testing mode that lets you inject a specific hand from the command line to verify your scoring logic against edge cases (e.g., straights with A low/high, flushes, etc.).

What This Program Does:
  * Uses a standard 52-card deck (shuffled fairly).
  * Deals 5 cards to the player.
  * Player can choose to keep or discard any cards.
  * Discarded cards are replaced from the deck.
  * Final hand is scored automatically based on poker rules.
  * Player can bet 1–5 tokens, and payouts scale accordingly.
  * Includes two game modes:
    * Normal random game
    * Test mode where a hand is given from the command line for testing purposes.

Classes Used:
  * Card	    |  Represents a single playing card
  * Deck	    |  Holds and shuffles 52 cards
  * Player	  |  Manages tokens and bets
  * Game	    |  Runs one full round of poker
