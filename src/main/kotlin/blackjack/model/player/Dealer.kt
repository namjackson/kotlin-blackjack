package blackjack.model.player

import blackjack.model.card.Cards

class Dealer(
    cards: Cards = Cards()
) : Player(
    name = NAME,
    cards = cards
) {
    override fun canMoreCard() = cards.canMoreCard() and isSmallThanDealerScore()

    private fun isSmallThanDealerScore() = cards.getScore().isSmallScoreThan(DEALER_MIN_SCORE)

    companion object {
        const val NAME = "Dealer"
        const val DEALER_MIN_SCORE = 16
    }
}
