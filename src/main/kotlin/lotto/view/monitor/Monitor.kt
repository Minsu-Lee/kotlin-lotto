package lotto.view.monitor

import lotto.model.statistics.LottoStatistics
import lotto.model.number.LottoNumbers

interface Monitor {
    fun displayLottoPurchaseAmount()

    fun displayLottoPurchasesCount(count: Int)

    fun displayInputLastWeekLottoWinningNumbers()

    fun displayIssuedLottoTickets(lottoTickets: List<LottoNumbers>)

    fun displayLottoStatistics(statistics: LottoStatistics)
}