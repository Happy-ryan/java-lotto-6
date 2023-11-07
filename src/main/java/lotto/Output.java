package lotto;

import java.util.List;

class Output {
    private static final int PERCENTAGE_MULTIPLIER = 100;
    private static final String PROMPT_PURCHASE_AMOUNT = "구입금액을 입력해 주세요.";
    private static final String NUMBER_OF_LOTTOS = "%d개를 구매했습니다.";
    private static final String PROMPT_WINNING_NUMBERS = "당첨 번호를 입력해 주세요.";
    private static final String PROMPT_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";
    private static final String TOTAL_PROFIT_RATE_MESSAGE = "총 수익률은 %.1f%%입니다.";

    private Output() {
    }

    static void printGameStartMessage() {
        System.out.println(PROMPT_PURCHASE_AMOUNT);
    }

    static void printUserMoney(int userMoney) {
        System.out.println(userMoney + "\n");
    }

    static void printNumberOfLottos(int numberOfLottoes) {
        System.out.println(String.format(NUMBER_OF_LOTTOS, numberOfLottoes));
    }

    static void printLottoSixNumber(Lotto lotto) {
        System.out.println(lotto.getSixLottoNumbers());
    }

    static void printLottoSixNumbers(List<Lotto> lottos){
        for (Lotto lotto : lottos) {
            Output.printLottoSixNumber(lotto);
        }
    }

    static void printLottoNumbersMessage() {
        System.out.println("\n" + PROMPT_WINNING_NUMBERS);
    }

    static void printLottoNumbers(List<Integer> sixLottoNumbers) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sixLottoNumbers.size(); i++) {
            sb.append(sixLottoNumbers.get(i));
            if (i != sixLottoNumbers.size() - 1) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString() + "\n");
    }

    static void printBonusNumberMessage() {
        System.out.println(PROMPT_BONUS_NUMBER);
    }

    static void printBonusNumber(int bonusNumber) {
        System.out.println(bonusNumber + "\n");
    }

    static void printWinningStatistics() {
        System.out.println("당첨 통계\n---");
    }

    static void printReturn(int totalWinningAmount, int userMoney) {
        float profitRate = ((float) totalWinningAmount / userMoney) * PERCENTAGE_MULTIPLIER;
        System.out.printf(TOTAL_PROFIT_RATE_MESSAGE, profitRate);
    }
}
