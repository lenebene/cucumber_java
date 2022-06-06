Feature: Accounting Process Validation for FX Mark to Market (MTM) Event
This feature will test the end-to-end process of Posting Sub Ledger entries for Event-based FX MTM event

   ## Pre requisite before every scenario
   Background:
    Given  Environment for application is "https://linkprotect.cudasvc.com/url?a=https%3a%2f%2flogin-epvg-test-saasfaprod1.fa.ocs.oraclecloud.com%2f&c=E,1,YqQLmu1adEfo4Ur1iQeIxocmihNivIaVO2fR7T29GKep4zt8IsSbszSUuDqrIp6cEXiW4H3ckxx-B-g4KkDFCZ8zavZEwaUJCfAaPA4cNg,,&typo=1"
    And login to application with username "James Wick"

   
 Scenario Outline:
    Given user is on 'File Import Export' page
    When upload the Trade data file from <location> and hit Submit
    And  Run 'Import Accounting Transactions' under schedule process
    Then Validate Subledger Enteries and View Journal Entry
    Examples:
    | location |
    | I:/fx_mtm_vanilla_positive.txt |
    | I:/fx_mtm_T0_positive.txt |
    | I:/fx_mtm_inactive_trade_negative.txt |
    | I:/fx_mtm_quote_date_less_thn_current.txt |
    | I:/fx_mtm_T1_positive.txt |
    | I:/fx_mtm_T1_negative.txt |
    | I:/fx_mtm_ME_positive.txt |
    | I:/fx_mtm_ME_negative.txt |
    | I:/fx_mtm_Treasury_firm_account.txt |
    | I:/fx_mtm_Non_Treasury_firm_account.txt |