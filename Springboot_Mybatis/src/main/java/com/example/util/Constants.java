package com.example.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 数据字典.
 *
 * @author mafan17515
 *
 */
public class Constants {

    public static final String SESSION_VERSION = "version";

    public static final String SESSION_VERSION_NO = "2020062914";

    public static class AgentBranchaAccountStatus {
        /**
         * 初期.
         */
        public static final String INITIAL = "01";

        /**
         * 発効.
         */
        public static final String OPEN = "02";

        /**
         * 凍結.
         */
        public static final String LOCKED = "03";

        /**
         * 失効.
         */
        public static final String EXPIRED = "09";

    }

    // app版本状态
    public static class AppversionStatus {
        /**
         * 初期.
         */
        public static final String INITIAL = "01";

        /**
         * 発効.
         */
        public static final String OPEN = "02";

        /**
         * 凍結.
         */
        public static final String LOCKED = "03";

        /**
         * 失効.
         */
        public static final String EXPIRED = "09";
    }

    // バックエンドフラグ
    public static class BackFlag {

        /**
         * はい.
         */
        public static final String YES = "1";

        /**
         * いいえ.
         */
        public static final String NO = "0";

    }

    /**
     * バッチTYPE
     */
    public static class BatchType {
        // 将API的对账单存储到DB
        public static final String SAVE_BILL = "01";
        // 对账
        public static final String CHECK_BILL = "02";
        // 清算
        public static final String CLEARING = "03";
        // 手续费
        public static final String ORDER_DETAIL_FEE = "04";
        // 申请サービス
        public static final String MERCHANTS_BULK_IMPORT = "05";
        // 微信清算
        public static final String WECHAT_CLEARING_FILE = "06";
        // 生成机构信息
        public static final String GER_ORGANIZATION = "07";
        // 取引集計
        public static final String TRADE_STATISTICS = "08";

        /////////////////////////////////

        public static final String DATA_TRANSFER = "09";
        // 取引明細ファイル
        public static final String SYS_TRADE_FILE = "10";
        // 下载JCB数据存储到DB
        public static final String SAVE_JCB = "11";

        // 下载JCB精算数据到DB
        public static final String SAVE_CLEARING = "12";

        // JCB汎用スキームデータ
        public static final String JCB_UNIVERSAL_DATA = "13";

        // 売上データアップロード
        public static final String UPLOAD_SALE_DATA = "14";

        // 売上データアップロード
        public static final String UPLOAD_TRADE_FILE = "15";

        // 加盟店的对账单上传sftp
        public static final String UPLOAD_TRADE_FILE_FOR_BRANCH = "16";

        // Onepay JQBC 生成文件
        public static final String UPLOAD_TRADE_FILE_JQBC_FOREIGN = "17";

        // Onepay系 下载对账单
        public static final String SAVE_ONEPAY_FOREIGN_BILL = "19";

        // 加盟店アクワイアラ付替えバッチ1
        public static final String AGENT_ALTER_FIRST = "20";

        // 加盟店アクワイアラ付替えバッチ2
        public static final String AGENT_ALTER_SECOND = "21";

        // 加盟店アクワイアラ付替えバッチ3
        public static final String AGENT_ALTER_THIRD = "22";

        // 加盟店アクワイアラ付替えバッチ4
        public static final String AGENT_ALTER_FOURTH = "23";
        /*    // 将超过13个月的 token_history 移到token_history_backup 中
            public static final String BACKUP_TOKENHISTORY = "09";
        
            // 将超过13个月的 token_history 移到token_history_backup 中
            public static final String BACKUP_ACCESSHISTORY = "10";
        
            // 将超过9个月的 order_detail 移到order_detail_90D_13M 中 ,再将超过13个月的 order_detail_90D_13M 移到order_detail_backup 中
            public static final String BACKUP_ORDERDETAIL ="11";*/
        /////////////////////////////////

        // 実績データ
        public static final String TRADE_DATA_FILE = "24";

        // アクセストークン要求
        public static final String GET_BANK_PAY_ACCESS_TOKEN = "25";

        // 中国系支付方法对账
        public static final String CHECK_CHINA_BILL = "26";

        // BankPay端末识别番号登录
        public static final String BANKPAY_TERNIMAL_IMPORT = "27";

        // Kddid店铺code登录
        public static final String KDDI_SHOP_CODE_UPDATE = "28";

        // JCB汎用スキーム毎日データ
        public static final String JCB_UNIVERSAL_DAILY_TRADE_DATA = "29";

        // 支払チャンネル情報Import
        public static final String CHANNELS_BULK_IMPORT = "30";

        // 店舗ISS固有キー情報Import
        public static final String SHOPISSKEYBULKIMPORT = "31";
        // marketing导入mpm的取引明细
        public static final String SAVE_TRADE_DATA = "32";
    }

    public static class MonitorBatchType {

        public static final String UPLOAD_TRADE_FILE_MONITOR_BATCH = "01";
        public static final String SYS_TRADE_FILE_MONITOR_BATCH = "02";
        public static final String UPLOAD_SALE_DATA_MONITOR_BATCH = "03";
        public static final String UPLOAD_TRADE_FILE_FOR_BRANCH_MONITOR_BATCH = "04";
        public static final String SAVE_BILL_TO_DB_MONITOR_BATCH = "05";
        public static final String TIME_OUT_MONITOR_BATCH = "06";

        public static final String SFTP_FILE_CHECK = "01";
        public static final String SAVE_BILL_TO_DB_CHECK = "02";
        public static final String TIMEOUT_CHECK = "03";
        public static final String RUNTIME_ERROR_CHECK = "04";
        public static final String ALERT_DETECTION = "05";
        public static final String DELETE_MONITOR = "06";
        public static final String SAVE_ACCESS_TO_MONITOR = "07";
    }

    public static class BatchStatus {
        public static final String STARTED = "STARTED";
        public static final String COMPLETED = "COMPLETED";
        public static final String FAILED = "FAILED";
        public static final String STARTING = "STARTING";
        public static final String UNKNOW = "UNKNOW";
    }

    /**
     * batch_monitor_config表中 配置监视任务的记录的状态
     */
    public static class BatchConfigStatus {
        public static final String DELETED = "00";// 任务被删除
        public static final String INITIAL = "01";// 未被读取
        public static final String READED = "02";// 已被监视器读取
        public static final String SCHEDULED = "03";// 任务已被安排

    }

    /**
     * JCB汎用スキームデータ作成バッチ参数
     */
    public static class jcbUniversalDataBatchParam {
        // 处理对象检索的开始日期
        public static final String START_DATE = "startDate";
        // 处理对象检索的结束日期
        public static final String END_DATE = "endDate";
    }

    // bitFlyer返回值
    public static class BcResultCode {
        /**
         * 0.
         */
        public static final String SUCCESS = "0";

        /**
         * 999.
         */
        // public static final String COMMUNICATION_ERROR = "999";

        /**
         * 998.
         */
        public static final String DB_ERROR = "998";

        /**
         * 997.
         */
        public static final String HOST_UNKNOWN = "997";

        /**
         * 996.
         */
        public static final String UNKNOWN_ERROR = "996";

        /**
         * 995.
         */
        public static final String CONNECTTIMEOUT_ERROR = "995";

        /**
         * 994.
         */
        public static final String SOCKETTIMEOUT_ERROR = "994";

        /**
         * 993.
         */
        public static final String COMMUNICATION_IO_ERROR = "993";
        /**
         * 992.
         */
        public static final String SOCKET_ERROR = "992";

        /**
         * 900.
         */
        public static final String BC_SYS_ERROR = "900";

        /**
         * 404.
         */
        public static final String BC_TRAN_NOT_EXIST = "404";

        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";

    }

    /**
     *
     *
     * @author jiangbo
     *
     */
    public static class BcTransState {
        /**
         * 支付成功.
         */
        public static final String FINISHED = "Finished";

        /**
         * 支付中.
         */
        public static final String WAITING = "Waiting";

        /**
         * 超过期限.
         */
        public static final String EXPIRED = "Expired";

        /**
         * 系统错误.
         */
        public static final String SYSTEME_ERROR = "SYSTEMERROR";

    }

    // 店铺等级
    public static class BranchLevel {
        /**
         * 加盟店.
         */
        public static final String MERCHANT = "01";

        /**
         * 店铺.
         */
        public static final String BRANCH = "02";
    }

    // 服务模式
    public static class BranchServiceMode {
        /**
         * B2C.
         */
        public static final String B2C = "01";

        /**
         * B2B.
         */
        public static final String B2B = "02";
    }

    // 店铺状态
    public static class BranchStatus {

        /**
         * 発効.
         */
        public static final String OPEN = "02";

        /**
         * 失効.
         */
        public static final String EXPIRED = "09";

    }

    // 支付宝返回的状态
    public static class CbwTransState {
        /**
         * 已付款
         */
        public static final String P = "P";

        /**
         * 已清算
         */
        public static final String L = "L";

        /**
         * 待处理（申请退款）
         */
        public static final String W = "W";

        /**
         * 失败（申请退款）
         */
        public static final String F = "F";
    }

    public static class CbwTransType {
        /**
         * 支付
         */
        public static final String P = "P";

        /**
         * 返金
         */
        public static final String R = "R";
    }

    public static class CellDataType {
        public static final String NUM = "01";
        public static final String STRING = "02";
    }

    // 渠道/商户（0=渠道 1=商户）
    public static class ChannelMerchant {
        public static final String CHANNEL = "0";
        public static final String MERCHANT = "1";
    }

    // 编码方式
    public static class CharSet {
        /**
         * UTF-8.
         */
        public static final String UTF_8 = "UTF-8";

    }

    /**
     * 对账错误信息.
     */
    public static class CheckErrorInfo {
        /**
         * 1-合作商编号不一致.
         */
        public static final String PARTNER_ACCT_DIFF = "01";
        /**
         * 2-渠道流水号不一致.
         */
        public static final String TRANS_ID_DIFF = "02";
        /**
         * 3-交易类型不一致.
         */
        public static final String TRANS_TYPE_DIFF = "03";
        /**
         * 4-交易时间不一致.
         */
        public static final String TRANS_TIME_DIFF = "04";
        /**
         * 5-金额不一致.
         */
        public static final String AMOUNT_DIFF = "05";
        /**
         * 6-交易状态不一致
         */
        public static final String TRANS_STATUS_DIFF = "06";
    }

    /**
     * 清算错误信息.
     */
    public static class ChearingErrorInfo {
        /**
         * 1-渠道单边账.
         */
        public static final String API_SINGLE = "01";
        /**
         * 2-金额不一致.
         */
        public static final String AMOUNT_DIFF = "02";
    }

    /**
     * 对账文件记录是否被处理的状态.
     */
    public static final class CheckHandleStatus {
        /**
         * 没有处理.
         */
        public static final String UNHANDLE = "0";
        /**
         * 已经处理.
         */
        public static String HANDLED = "1";
    }

    // DB的长度check要求
    public static class checkLength {
        public static final int SIXTY_FOUR = 64;
        public static final int THIRTY_TWO = 32;
        public static final int ONE_HUNDRED = 100;
        public static final int EIGHT = 8;
        public static final int TWO = 2;
    }

    /**
     * 对账状态.
     */
    public static class CheckStatus {

        /**
         * 已对平.
         */
        public static final String CHECK_OK = "01";
        /**
         * 平台单边账.
         */
        public static final String LOCAL_SINGLE = "02";
        /**
         * 渠道单边账
         */
        public static final String API_SINGLE = "03";
        /**
         * 对账异常.
         */
        public static final String CHECK_EXCEPTION = "04";

        /**
         * 跨日交易.
         */
        public static final String CROSS_DAY = "05";
        /**
         * 交易失败 疑似对平.
         */
        public static final String TRADE_FAIL = "06";
        /**
         * 待查证.
         */
        public static final String WAIT_CHECK = "07";
        /**
         * 处理中.
         */
        public static final String PROCESSING = "08";
        /**
         * 未对账.
         */
        public static final String NO_CHECK = "09";
    }

    /**
     * 精算状态.
     */
    public static class ChearStatus {

        /**
         * 已对平.
         */
        public static final String CHECK_OK = "01";
        /**
         * 平台单边账.
         */
        public static final String LOCAL_SINGLE = "02";
        /**
         * 渠道单边账
         */
        public static final String API_SINGLE = "03";
        /**
         * 对账异常.
         */
        public static final String CHECK_EXCEPTION = "04";

        /**
         * 跨日交易.
         */
        public static final String CROSS_DAY = "05";
        /**
         * 交易失败 疑似对平.
         */
        public static final String TRADE_FAIL = "06";
        /**
         * 待查证.
         */
        public static final String WAIT_CHECK = "07";
        /**
         * 处理中.
         */
        public static final String PROCESSING = "08";
        /**
         * 未对账.
         */
        public static final String NO_CHECK = "09";
    }

    // 签名方式
    public static class CipherType {
        /**
         * RSA.
         */

        public static final String RSA = "RSA";

        /**
         * MD5.
         */
        public static final String MD5 = "MD5";
    }

    public static class clearingCSVStates {
        // 01:作成失敗
        public static final String FAIL = "01";
        // 02:作成成功
        public static final String SUCCESS = "02";
        // 03:作成対象外
        public static final String OUTCREATE = "03";
        // 04:未作成
        public static final String NOCREATE = "04";
    }

    // 精算ステータス
    public static class ClearingStatus {
        /**
         * 精算失敗.
         */
        public static final String FAIL = "01";
        /**
         * 精算成功.
         */
        public static final String SUCCESS = "02";
        /**
         * 再精算.
         */
        public static final String REDO = "03";
        /**
         * 精算対象外.
         */
        public static final String OUT = "04";
        /**
         * 未精算
         */
        public static final String NO_CLEARING = "05";
    }

    // 通讯类型（默认1，代表http）
    public static class ConnType {
        public static final String HTTP = "1";
    }

    // 国际化编码
    public static class CpayLocale {
        public static final String CHN = "CHINA";
        public static final String JP = "JAPAN";
        public static final String US = "US";
    }

    // Cpay的订单状态(取消的时候看订单状态)
    public static class CpayOrderStatus {
        public static final String CANCELING = "19";
        public static final String CANCEL_SUCCESS = "14";
        public static final String CANCEL_FAIL = "12";
        public static final String CANCEL_TIMEOUT = "13";
    }

    // Cpay的支付状态
    public static class CpayPayStatus {
        public static final String WAIT_PAY = "00";
        public static final String PAYING = "09";
        public static final String SUCCESS = "01";
        public static final String FAIL = "02";
        public static final String TIMEOUT = "03";
    }

    // Cpay的退款状态
    public static class CpayRefundStatus {
        public static final String REFUNDING = "19";
        public static final String SUCCESS = "11";
        public static final String FAIL = "12";
        public static final String TIMEOUT = "13";
    }

    // Cpay的基本返回代码
    public static class CpayReturnCode {
        public static final String SUCCESS = "0TE110001000";
        public static final String FAIL = "0TE110001999";
        public static final String TIMEOUT = "0TE110004000";
        public static final String CHANNEL_ERROR = "0TE110007001";
    }

    // 加密类型
    public static class CpaySignType {
        public static final String RSA = "RSA";
    }

    // Onepay的支付状态
    public static class OnepayPayStatus {
        public static final String WAIT_PAY = "00";
        public static final String PAYING = "09";
        public static final String SUCCESS = "01";
        public static final String FAIL = "02";
        public static final String TIMEOUT = "03";
    }

    // Onepay加密类型
    public static class OnepaySignType {
        public static final String RSA = "RSA";
    }

    // Cpay的基本返回代码
    public static class OnepayReturnCode {
        public static final String SUCCESS = "";
        public static final String FAIL = "0TE110001999";
        public static final String TIMEOUT = "0TE110004000";
        public static final String CHANNEL_ERROR = "0TE110007001";
    }

    // --JCB start -->
    // JCB的支付状态
    public static class JCBPayStatus {
        public static final String WAIT_PAY = "00";
        public static final String PAYING = "09";
        public static final String SUCCESS = "01";
        public static final String FAIL = "02";
        public static final String TIMEOUT = "03";
    }

    // JCB加密类型
    public static class JCBSignType {
        public static final String RSA = "RSA";
    }

    // JCB的基本返回代码
    public static class JCBReturnCode {
        public static final String SUCCESS = "";
        public static final String FAIL = "0TE110001999";
        public static final String TIMEOUT = "0TE110004000";
        public static final String CHANNEL_ERROR = "0TE110007001";
    }
    // --JCB end <--

    // フェイル方式
    public static class CreateFileType {
        /**
         * 日别.
         */
        public static final String RUIKEI = "01";
        /**
         * 累計.
         */
        public static final String HIBETU = "02";
    }

    // 作成ステータス
    public static class CreateStatus {
        /**
         * 作成失敗.
         */
        public static final String FAIL = "01";

        /**
         * 作成成功.
         */
        public static final String SUCCESS = "02";

        /**
         * 作成対象外.
         */
        public static final String OUT = "03";
    }

    // 标价币种
    public static class Currency {
        /**
         * 英镑.
         */
        public static final String GBP = "GBP";

        /**
         * 港币.
         */
        public static final String HKD = "HKD";

        /**
         * 美元.
         */
        public static final String USD = "USD";

        /**
         * 日元.
         */
        public static final String JPY = "JPY";

        /**
         * 加拿大元.
         */
        public static final String CAD = "CAD";

        /**
         * 澳元.
         */
        public static final String AUD = "AUD";

        /**
         * 欧元.
         */
        public static final String EUR = "EUR";

        /**
         * 新西兰元.
         */
        public static final String NZD = "NZD";

        /**
         * 韩元.
         */
        public static final String KRW = "KRW";

    }

    // 请求方向（默认0，内部）
    public static class Direction {
        public static final String OUT = "1";
        public static final String IN = "0";
    }

    /**
     * docomo取得ファイル識別子.
     *
     * @return 取得ファイル識別子
     *
     */
    public static class DocomoFileFlg {
        /**
         * 確定済
         */
        public static final String PAY = "B623_";
        /**
         * 取消済
         */
        public static final String REVERSE = "B624_";

    }

    /**
     * quo取得ファイル識別子.
     */
    public static class QuoFileFlg {
        /**
         * 利用
         */
        public static final String PAY = "0030";
        /**
         * 利用キャンセル
         */
        public static final String REVERSE = "0040";

    }

    /**
     * docomo取得ファイル結果コード.
     *
     * @return 取得ファイル結果コード
     *
     */
    public static class DocomoFileStatus {
        /**
         * 正常完了
         */
        public static final String OK = "OK";
        /**
         * 利用判定NG
         */
        public static final String AN = "AN";
        /**
         * 処理未完了
         */
        public static final String UG = "UG";
        /**
         * 利用判定NG
         */
        public static final String NG = "NG";

    }

    /**
     * DocomoResult
     *
     * @return
     *
     */
    public static class DocomoResult {

        public static final String OK = "OK";
        public static final String NG = "NG";
        // public static final String CONNECTIONPOOLTIMEOUTEXCEPTION = "E02002";
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";
        public static final String RESPONSE_EMPTY = "E09299";

        /**
         * 確定済
         */
        public static final String CONFIRM_SUCCESS = "8A";
        /**
         * 取消受付済
         */
        public static final String REFUND_IN = "86";
        /**
         * 取消済
         */
        public static final String REFUND_SUCCESS = "89";
        /**
         * 障害取消受付済
         */
        public static final String REVERSE_IN = "87";
        /**
         * 障害取消受付済
         */
        public static final String REVERSE_SUCCESS = "8S";
        /**
         * 補正受付済
         */
        public static final String MODIFY_IN = "8G";
        /**
         * 補正済
         */
        public static final String MODIFY_SUCCESS = "8J";
        /**
         * 該当データなし
         */
        public static final String EMPTY_DATA = "04";
        /**
         * 受付完了
         */
        public static final String PROCESS_FINISHED = "00";

    }

    // 申请service时对象状态
    public static class EnumActionType {
        /**
         * 新增
         */
        public static final String ADD = "0";
        /**
         * 修改
         */
        public static final String UPDATE = "1";
        /**
         * 未更新
         */
        public static final String INVARIATE = "2";
        /**
         * 删除
         */
        public static final String DELETE = "9";

    }

    // VD返回值
    public static class ExecMode {
        /**
         * 000.
         */
        public static final String PAY = "000";
        /**
         * 000.
         */
        public static final String REFUND = "003";
        /**
         * 000.
         */
        public static final String REVERSE = "004";
        /**
         * 000.
         */
        public static final String CONFIRM = "007";
    }

    public static class FeeType {
        public static final String FEE_IN = "01";
        public static final String FEE_OUT = "02";
    }

    public static class FileRecordIsChecked {
        public static final String YES = "1";
        public static final String NO = "0";
    }

    // 用户级别 、 角色类型，等级
    public static class Grade {
        /**
         * 系统管理.
         */
        public static final String SYSTEM_GRADE = "01";

        /**
         * 代理商.
         */
        public static final String AGENT_GRADE = "02";

        /**
         * 加盟店.
         */
        public static final String BRANCH_GRADE = "03";

        /**
         * 店铺.
         */
        public static final String SHOP_GRADE = "04";
    }

    // 公開キー承认状态
    public static class publicKeyConfirmStatus {
        /**
         * 未承认.
         */
        public static final String CONFIRM_NO = "01";

        /**
         * 已承认.
         */
        public static final String CONFIRM_YES = "02";
    }

    public static class HTTPRequestMethod {
        public static final int GET = 0;
        public static final int POST = 1;
        public static final int DELETE = 2;
    }

    // 是否后台交易（1：是 0否） 默认1
    public static class IsBackTran {
        public static final String YES = "1";
        public static final String NO = "0";
    }

    // 是否是默认的值
    public static class IsDefault {
        /**
         * 是默认
         */
        public static final String YES = "1";
        /**
         * 不是默认
         */
        public static final String NO = "0";
    }

    // 小票号等状态
    public static class JournalType {
        /**
         * 存在
         */
        public static final String YES = "1";

        /**
         * 不存在.
         */
        public static final String NO = "0";
    }

    // 端末KEY利用
    public static class keyType {
        /**
         * はい.
         */
        public static final String YES = "01";

        /**
         * いいえ.
         */
        public static final String NO = "02";
    }

    /**
     * 根據codemaster表中的keyType取出terminalType 的map
     */
    public static class KeyTypeOfCodeMaster {
        // terminalType
        public static String TerminalType = "terminalType";
    }

    public static class LineConfirmType {
        public static final String ORDER_ID = "orderId";
        public static final String TRANS_ID = "transactionId";
    }

    public static class LineNeedCheck {

        public static final String YES = "Y";
        public static final String NO = "N";
    }

    // Line返回值
    public static class LineResultCode {

        /**
         * 999.
         */
        // public static final String COMMUNICATION_ERROR = "W999";

        /**
         * 998.
         */
        public static final String DB_ERROR = "W998";

        /**
         * 997.
         */
        public static final String HOST_UNKNOWN = "W997";

        /**
         * 996.
         */
        public static final String UNKNOWN_ERROR = "W996";

        /**
         * 995.
         */
        public static final String CONNECTTIMEOUT_ERROR = "W995";

        /**
         * 994.
         */
        public static final String SOCKETTIMEOUT_ERROR = "W994";

        /**
         * 992.
         */
        public static final String SOCKET_ERROR = "W992";
        /**
         * 991.
         */
        public static final String COMMUNICATION_I_ERROR = "W991";

        /**
         * E02001.
         */
        public static final String COMMUNICATION_ERROR = "E02001";
        /**
         * E02002.
         */
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        /**
         * E02003.
         */
        public static final String SERVER_RES_TIMEOUT = "E02003";
        /**
         * E09299.
         */
        // public static final String RESPONSE_EMPTY = "E09301";
        public static final String RESPONSE_EMPTY = "E09299";
        public static final String UNKNOWNERROR = "E09299";
        public static final String LIMITS_OVER = "1184";
        public static final String DEPOSIT_LIMITS_OVER = "DEPOSIT1184";
        public static final String PAY_LIMITS_OVER = "PAY1184";
        public static final String PACKAGES_NAME = "LINEPay決済";
    }

    // Line返回结果状态码
    public static class TqcLineResultCode {
        public static final String CONFIRM_URL_TYPE = "SERVER";
        public static final String FIELDS = "TRANSACTION";
        public static final String SUCCESS = "0000";
        public static final String SUCCESS_CONFIRM = "0000confirm";
        public static final String PAID = "0123";
        public static final String CANCELED = "0121";
        public static final String FAILED = "0122";
        public static final String PAYING = "0110";
        public static final String TRADE_NOT_EXIT = "1150";
        public static final String TRANSACTION_NOT_FOUND = "TRANSACTION_NOT_FOUND";
        public static final String REQUEST_DUPLICATED = "1198";
    }

    // Line返回结果状态码
    public static class LineReturnCode {
        public static final String SUCCESS = "0000";
        public static final String NO_FOUND = "1150";
    }

    // result分页
    public static class LinesPerPage {
        /**
         * 当前页.
         */
        public static final String CURRENTPAGE = "1";

        /**
         * 当前页记录数.
         */
        public static final String LIMIT = "10";

        /**
         * 开始记录数.
         */
        public static final String START = "1";

        /**
         * 总记录数.
         */
        public static final String TOTALCOUNT = "10";

        /**
         * 总页数.
         */
        public static final String TOTALPAGES = "1";
    }

    // Line 返回的状态
    public static class LineTransState {

        public static final String AUTH_READY = "AUTH_READY";
        public static final String COMPLETE = "COMPLETE";
        public static final String FAIL = "FAIL";

        public static final String PAYMENT = "PAYMENT";
        public static final String PAYMENT_REFUND = "PAYMENT_REFUND";
        public static final String PARTIAL_REFUND = "PARTIAL_REFUND";
    }

    // Line返回结果状态码
    public static class LineUrlType {
        public static final String CONFIRM = "confirm";
        public static final String CANCEL = "cancel";
    }

    public static class TqcLineConfirmType {
        public static final String ORDER_ID = "orderId";
        public static final String TRANS_ID = "transactionId";
    }

    public static class Locale {
        /**
         * 中文.
         */
        public static final String ZH = "zh";

        /**
         * 日文.
         */
        public static final String JP = "jp";

        /**
         * 英文.
         */
        public static final String EN = "en";

    }

    // log文件出错flg
    public static class logFlg {
        /**
         * 不写log
         */
        public static final String NOLOG = "01";

        /**
         * 失败log
         */
        public static final String DISLOG = "02";
        /**
         * stub画面显示更新内容
         */
        public static final String STUB = "03";
    }

    // IP限制
    public static class LoginIpStatus {
        /**
         * 初期.
         */
        public static final String INITIAL = "01";
        /**
         * 発効.
         */
        public static final String OPEN = "02";
        /**
         * 凍結.
         */
        public static final String LOCKED = "03";
        /**
         * 失効.
         */
        public static final String EXPIRED = "09";
    }

    public static class MerchantDeviceType {
        public static final String POS = "POS";
    }

    // 消息码
    public static class MsgCode {
        /**
         * 通讯异常.
         */
        public static final String COMMUNICATION_IO_EXCEPTION = "E02001";
        /**
         * 与外部系统连接超时.
         */
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        /**
         * 外部系统应答超时.
         */
        public static final String SERVER_RES_TIMEOUT = "E02003";
        /**
         * 支付机构返回超时（比如Cpay返回4000系列）.
         */
        public static final String CHANNEL_TIMEOUT = "E02004";
        /**
         * 请求参数异常，必须项未输入.
         */
        public static final String REQ_PARA_NULL = "E09101";

        /**
         * 请求参数异常，日期条件不正确.
         */
        public static final String REQ_PARA_DATE_EXCEPTION = "E09102";

        /**
         * 订单号不存在.
         */
        public static final String ORDER_NUM_NOT_EXIST = "E09103";
        /**
         * 用户名密码不匹配.
         */
        public static final String USERNAME_NOT_MATCH_PASS = "E09104";
        /**
         * 密码更新失败.
         */
        public static final String PASS_MODIFY_FAIL = "E09105";

        /**
         * 终端不存在或者无效.
         */
        public static final String INVALIDE_TERMINAL = "E09106";
        /**
         * 不存在可撤销或退款的订单.
         */
        public static final String REFUND_OR_REVERSE_NOT_EXIST = "E09108";
        /**
         * DB异常.
         */
        public static final String DB_OPERATION_EXCEPTION = "E09201";

        /**
         * 终端激活失败.
         */
        public static final String INVALIDE_PRODUCT_KEY = "E09107";

        /**
         * 支付方式不存在或者无效.
         */
        public static final String PAT_TYPE_NOT_EXIST = "E09108";
        /**
         * 请求参数异常,金额类型不正.
         */
        public static final String REQ_PARA_AMOUNT_EXCEPTION = "E09109";
        /**
         * 请求参数异常,长度超出.
         */
        public static final String REQ_PARA_LEN_EXCEPTION = "E09110";
        /**
         * 请求参数异常,国际化参数无效.
         */
        public static final String REQ_PARA_LOCALE_EXCEPTION = "E09111";
        /**
         * 请求参数异常,时区无效.
         */
        public static final String REQ_PARA_TIMEZONE_EXCEPTION = "E09112";
        /**
         * 请求参数异常,授权码无效.
         */
        public static final String REQ_PARA_USERCODE_EXCEPTION = "E09113";
        /**
         * 该退款或撤销订单已超过有效期.
         */
        public static final String REFUND_OR_REVERSE_TIMEOUT = "E09114";
        /**
         * 请求参数异常,货币单位无效.
         */
        public static final String REQ_PARA_CURRENCY_EXCEPTION = "E09115";
        /**
         * 不支持的签名方式.
         */
        public static final String SIGN_TYPE_EXCEPTION = "E09116";
        /**
         * 退款明细不存在.
         */
        public static final String REFUND_ORDER_NOT_EXIST = "E09117";
        /**
         * 已撤销，无法再次撤销.
         */
        public static final String REVERSE_FAIL_FOR_REVERSE = "E09118";
        /**
         * 已退款，无法撤销.
         */
        public static final String REVERSE_FAIL_FOR_REFUND = "E09119";
        /**
         * 支付币种与退款币种不一致.
         */
        public static final String REFUND_FAIL_FOR_CURRENCYCODE = "E09120";
        /**
         * 已撤销，无法退款.
         */
        public static final String REFUND_FAIL_FOR_REVERSE = "E09121";
        /**
         * 无权访问.
         */
        public static final String URL_NO_PRIVILEGE = "E09122";
        /**
         * 退款金额超过支付金额.
         */
        public static final String INVALID_REFUND_AMOUNT = "E09123";
        /**
         * APP版本不存在.
         */
        public static final String INVALID_APP_CODE = "E09124";

        /**
         * 请求参数异常,有效时间异常.
         */
        public static final String REQ_PARA_VALIDTIME_EXCEPTION = "E09125";

        /**
         * 不支持的接口.
         */
        public static final String INVALID_SUPPORT = "E09126";

        /**
         * 请求参数异常,XX格式异常.
         */
        public static final String REQ_PARA_FORMAT_EXCEPTION = "E09127";

        /**
         * 支付金额与退款金额不一致.
         */
        public static final String REFUND_FAIL_FOR_AMOUNT = "E09128";

        /**
         * 目前、不支持JPY以外货币单位.
         */
        public static final String CURRENCYCODE_NOT_SUPPORT = "E09129";

        /**
         * 请求参数异常，值类型无效.
         */
        public static final String REQ_PARA_VALUETYPE_EXCEPTION = "E09130";
        /**
         * 取消トランザクションが取消できない.
         */
        public static final String REVERSE_FAIL_FOR_REVERSE_DETAIL = "E09131";
        /**
         * 入金オーダが返金できません.
         */
        public static final String REFUND_FAIL_FOR_DEPOSIT = "E09132";
        /**
         * 入金オーダが返金できません.
         */
        public static final String REVERSE_FAIL_FOR_OTHER_DEAL = "E09133";
        /**
         * 返金オーダが返金できません.
         */
        public static final String REFUND_FAIL_FOR_REFUND_DETAIL = "E09134";
        /**
         * 取消オーダが返金できません.
         */
        public static final String REFUND_FAIL_FOR_REVERSE_DETAIL = "E09135";
        /**
         * 該当支払方法が入金できません.
         */
        public static final String DEPOSIT_NOT_SUPPORT = "E09136";
        /**
         * 返金トランザクションが取消できません.
         */
        public static final String REVERSE_FAIL_FOR_REFUND_DETAIL = "E09137";
        /**
         * 返金ができません.
         */
        public static final String REFUND_NOT_SUPPORT = "E09138";

        /**
         * 取消ができません.
         */
        public static final String REVERSE_NOT_SUPPORT = "E09139";

        /**
         * 无法支付.
         */
        public static final String PAY_NOT_SUPPORT = "E09140";

        /**
         * 検索日時が{0}日以内に設定してください,
         */
        public static final String ORDER_QUERY_RANGE_EXCESS = "E09142";
        /**
         * 検索期間が{0}日以内に設定してください。
         */
        public static final String ORDER_DATE_RANGE_EXCESS = "E09143";
        /**
         * 検索結果が{0}件を超えました、検索条件を再設定してください。
         */
        public static final String QUERY_RESULT_EXCESS = "E09144";

        /**
         * 内部系统异常.
         */
        public static final String INTERNAL_SYSTEM_EXCEPTION = "E09202";

        /**
         * 外部系统异常.
         */
        public static final String EXTERNAL_SERVER_EXCEPTION = "E09301";

        /**
         * 无效的请求.
         */
        public static final String INVALID_REQ = "E09901";
        /**
         * 验签失败 ILLEGAL_SIGN
         */
        public static final String ILLEGAL_SIGN = "ILLEGAL_SIGN";
        /**
         * 自動バーコード判別失敗
         */
        public static final String IDENTIFYFAILED = "E09141";
        /**
         * unknown error
         */
        public static final String UNKNOWNERROR = "E09299";
        /**
         * 支付通道过期
         */
        public static final String PAY_TYPE_EXPIRED = "E09203";
    }

    // 消息码
    public static class MsgParam {
        /**
         * 终端编号.
         */
        public static final String TERMINALCODE = "ERRFIELD.TERMINALCODE";

        /**
         * 店铺号.
         */
        public static final String BRANCHCODE = "ERRFIELD.BRANCHCODE";

        /**
         * 用户编码.
         */
        public static final String USERCODE = "ERRFIELD.USERCODE";

        /**
         * 用户密码.
         */
        public static final String USERPWD = "ERRFIELD.USERPWD";

        /**
         * 签名.
         */
        public static final String SIGN = "ERRFIELD.SIGN";

        /**
         * 注册码.
         */
        public static final String PRODUCTKEY = "ERRFIELD.PRODUCTKEY";
        /**
         * 终端异常.
         */
        public static final String INVALIDE_RECEIPTNO = "E09901.INVALIDE.RECEIPTNO";
        /**
         * 旧密码.
         */
        public static final String USEROLDPWD = "ERRFIELD.USEROLDPWD";

        /**
         * 新密码.
         */
        public static final String USERNEWPWD = "ERRFIELD.USERNEWPWD";

        /**
         * 确认密码.
         */
        public static final String USERCONFIRMPWD = "ERRFIELD.USERCONFIRMPWD";

        /**
         * 时区.
         */
        public static final String TIMEZONE = "ERRFIELD.TIMEZONE";

        /**
         * Token或者流水号或者订单号.
         */
        public static final String TOKENORDETAILID = "ERRFIELD.TOKENORDETAILID";

        /**
         * Token或者流水号.
         */
        public static final String TOKENORDETAIL = "ERRFIELD.TOKENORDETAIL";

        /**
         * Token或者订单号.
         */
        public static final String TOKENORID = "ERRFIELD.TOKENORID";

        /**
         * 标价币种.
         */
        public static final String CURRENCYCODE = "ERRFIELD.CURRENCYCODE";

        /**
         * 标价金额.
         */
        public static final String AMOUNT = "ERRFIELD.AMOUNT";

        /**
         * 支付方式.
         */
        public static final String PAYTYPE = "ERRFIELD.PAYTYPE";

        /**
         * APP版本号.
         */
        public static final String APPVERSION = "ERRFIELD.APPVERSION";

        /**
         * 备考.
         */
        public static final String REMARK = "ERRFIELD.REMARK";
        /**
         * 返金理由.
         */
        public static final String REFUNDREASON = "ERRFIELD.REFUNDREASON";
        /**
         * 拡張情報.
         */
        public static final String EXTENDINFO = "ERRFIELD.EXTENDINFO";
        /**
         * 拡張情報.
         */
        public static final String QRYTOKEN = "ERRFIELD.QRYTOKEN";
        /**
         * 開始レコード数
         */
        public static final String START = "ERRFIELD.START";
        /**
         * 件数
         */
        public static final String LIMIT = "ERRFIELD.LIMIT";
        /**
         * 開始日付
         */
        public static final String STARTDATE = "ERRFIELD.STARTDATE";
        /**
         * 終了日付
         */
        public static final String ENDDATE = "ERRFIELD.ENDDATE";
        /**
         * 自定义终端编号
         */
        public static final String TERMINALSELFCODE = "ERRFIELD.TERMINALSELFCODE";
        /**
         * 交易类型
         */
        public static final String TRANSTYPE = "ERRFIELD.TRANSTYPE";

        /**
         * 退款金额.
         */
        public static final String REFUNDAMOUNT = "ERRFIELD.REFUNDAMOUNT";

        /**
         * 交易流水号.
         */
        public static final String ORDERDETAILID = "ERRFIELD.ORDERDETAILID";

        /**
         * tqc流水detail id
         */
        public static final String TRANSSERIAL = "ERRFIELD.TRANSSERIAL";

        /**
         * 订单号.
         */
        public static final String ORDERID = "ERRFIELD.ORDERID";

        /**
         * 票据号.
         */
        public static final String RECEIPTNO = "ERRFIELD.RECEIPTNO";

        /**
         * 公钥.
         */
        public static final String PUBLICKEY = "ERRFIELD.PUBLICKEY";
        /**
         * token.
         */
        public static final String TOKEN = "ERRFIELD.TOKEN";
        /**
         * 国际化编码.
         */
        public static final String LOCALE = "ERRFIELD.LOCALE";

        /**
         * JSON
         */
        public static final String JSON = "ERRFIELD.JSON";

        /**
         * VALUETYPE
         */
        public static final String VALUETYPE = "ERRFIELD.VALUETYPE";

        /**
         * 加盟店号.
         */
        public static final String MERCHANTCODE = "ERRFIELD.MERCHANTCODE";

        /**
         * 订单有效时间.
         */
        public static final String VALIDTIME = "ERRFIELD.VALIDTIME";

        /**
         * terminal表.
         */
        public static final String TERMINAL = "E09201.TERMINAL";

        /**
         * terminal_user表.
         */
        public static final String TERMINAL_USER = "E09201.TERMINAL_USER";

        /**
         * order_Main表.
         */
        public static final String ORDER_MAIN = "E09201.ORDER_MAIN";

        /**
         * order_detail表.
         */
        public static final String ORDER_DETAIL = "E09201.ORDER_DETAIL";

        /**
         * access_history表.
         */
        public static final String ACCESS_HISTORY = "E09201.ACCESS_HISTORY";

        /**
         * token_history表.
         */
        public static final String TOKEN_HISTORY = "E09201.TOKEN_HISTORY";

        /**
         * digital_sign表.
         */
        public static final String DIGITAL_SIGN = "E09201.DIGITAL_SIGN";
        /**
         * token_history表.
         */
        public static final String NOTIFY_INFO = "E09201.NOTIFY_INFO";
        /**
         * 不正なアクセス.
         */
        public static final String INVALIDE_ACCESS = "E09901.INVALIDE.ACCESS";
        /**
         * 签名异常.
         */
        public static final String INVALID_SIGN = "E09901.INVALIDE.SIGN";

        /**
         * Token异常.
         */
        public static final String INVALIDE_TOKEN = "E09901.INVALIDE.TOKEN";

        /**
         * 终端异常.
         */
        public static final String INVALIDE_TERMINAL = "E09901.INVALIDE.TERMINAL";

        /**
         * 支付方式异常.
         */
        public static final String INVALIDE_PAYTYPE = "E09901.INVALIDE.PAYTYPE";

        /**
         * 店铺号异常.
         */
        public static final String INVALIDE_BRANCH = "E09901.INVALIDE.BRANCH";

        /**
         * 请求参数异常.
         */
        public static final String INVALIDE_BODY = "E09901.INVALIDE.BODY";

        /**
         * 请求参数异常.
         */
        public static final String INVALIDE_REQUEST = "E09901.INVALIDE.REQUEST";
        /**
         * 加盟店异常.
         */
        public static final String INVALIDE_MERCHANT = "E09901.INVALIDE.MERCHANT";
        /**
         * 加盟店不支持自动barcode判别.
         */
        public static final String INVALIDE_MERCHANT_IDENTIFY = "E09901.INVALIDE.BRANCH.DONOTSUPPORTIDENTIFY";
        /**
         * 読み込んだバーコードが判定できません
         */
        public static final String IDENTIFY_AUTO_BARCODE_FAILED = "E09141.IDENTIFYFAILED";
        /**
         * 読み込んだ QRコードが判定できません
         */
        public static final String IDENTIFY_QR_CODE_FAILED = "E09141.IDENTIFYFAILED.QRCODE";
        /**
         * 支払方式は期限切れになりました。
         */
        public static final String PAY_TYPE_EXPIRED = "E09203.PAT_TYPE_EXPIRED";
    }

    // 订单状态
    public static class OrderState {
        /**
         * 支付成功.
         */
        public static final String PAY_SUCCESS = "00";

        /**
         * 支付失败.
         */
        public static final String PAY_FAIL = "01";

        /**
         * 待支付.
         */
        public static final String PAY_WAIT = "02";

        /**
         * 支付中.
         */
        public static final String PAY_IN = "03";

        /**
         * 支付超时.
         */
        public static final String PAY_OVERTIME = "04";

        /**
         * 支付退款中.
         */
        public static final String REFUND_IN = "05";

        /**
         * 支付退款成功.
         */
        public static final String REFUND_OK = "06";

        /**
         * 支付退款失败.
         */
        public static final String REFUND_FAIL = "07";

        /**
         * 支付退款超时.
         */
        public static final String REFUND_OVERTIME = "08";

        /**
         * 撤销中.
         */
        public static final String CANCEL_IN = "09";

        /**
         * 撤销成功.
         */
        public static final String CANCEL_SUCCESS = "10";

        /**
         * 撤销失败.
         */
        public static final String CANCEL_FAIL = "11";

        /**
         * 撤销超时.
         */
        public static final String CANCEL_OVERTIME = "12";

        /**
         * 订单关闭.
         */
        public static final String ORDER_CLOSE = "13";

        /**
         * 等待用户支付.
         */
        public static final String WAIT_USER_PAY = "14";

        /**
         * 用户支付中止.
         */
        public static final String USER_CANCEL = "15";
        /**
         * 入金中.
         */
        public static final String DEPOSIT_IN = "16";
        /**
         * 入金超时.
         */
        public static final String DEPOSIT_OVERTIME = "17";
        /**
         * 入金成功.
         */
        public static final String DEPOSIT_SUCCESS = "18";
        /**
         * 入金失败.
         */
        public static final String DEPOSIT_FAIL = "19";
        /**
         * 返金取消中.
         */
        public static final String REFUND_REVERSE_IN = "20";
        /**
         * 返金取消成功.
         */
        public static final String REFUND_REVERSE_SUCCESS = "21";
        /**
         * 返金取消失败.
         */
        public static final String REFUND_REVERSE_FAIL = "22";
        /**
         * 返金取消超时.
         */
        public static final String REFUND_REVERSE_OVERTIME = "23";
        /**
         * 入金取消中.
         */
        public static final String DEPOSIT_REVERSE_IN = "24";
        /**
         * 入金取消成功.
         */
        public static final String DEPOSIT_REVERSE_SUCCESS = "25";
        /**
         * 入金取消失败.
         */
        public static final String DEPOSIT_REVERSE_FAIL = "26";
        /**
         * 入金取消超时.
         */
        public static final String DEPOSIT_REVERSE_OVERTIME = "27";

    }

    // 订单种类
    public static class OrderType {
        /**
         * 刷卡支付.
         */
        public static final String CARD = "01";

        /**
         * 正向扫码.
         */
        public static final String TQC = "02";

        /**
         * 商户web系统.
         */
        public static final String CBW = "03";

        /**
         * 无金额正向扫码.
         */
        public static final String TQC_WITHOUT_AMOUNT = "04";
    }

    // 机构等级
    public static class OrganizationLevel {
        /**
         * 第三方支付机构.
         */
        public static final String THIRD_PARTY = "01";
        /**
         * 代理商.
         */
        public static final String AGENT = "02";
        /**
         * 加盟店.
         */
        public static final String BRANCH = "03";
    }

    /**
     * OrigamiResult
     *
     * @author chenhang22934
     *
     */
    public static class OrigamiResult {
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";
        /**
         * エラーなし
         */
        public static final String SUCCESS = "P00";
        /**
         * ステータスコード 支払い成功
         */
        public static final String PAY_SUCCESS = "000";
        /**
         * 支払い失敗
         */
        public static final String PAY_FAIL = "001";
        /**
         * 存在しない支払い
         */
        public static final String PAY_NOT_EXIT = "002";

        /**
         * 取消済
         */
        public static final String CANCEL_SUCCESS = "003";
        /**
         * 処理中（Origami）
         */
        public static final String PROCESSING = "004";

        /**
         * 該当データなし
         */
        public static final String EMPTY_DATA = "E09299";

    }

    /**
     * リクエストの種別
     *
     * @author zhangyd24942
     *
     */
    public static class MerpayRpcType {
        /**
         * charge
         */
        public static final String PAY = "1";
        /**
         * refund
         */
        public static final String REFUND = "2";
        /**
         * reversal
         */
        public static final String REVERSE = "3";
    }

    /**
     * MerpayResult
     *
     * @author zhangyd24942
     *
     */
    public static class MerpayResult {
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";
        public static final String MERPAY_ERROR = "MER500";
        public static final String MERPAY_MAINTENANCE = "MER503";
        public static final String MERPAY_SEVER_ERROR = "500001";
        /**
         * 該当データなし
         */
        public static final String EMPTY_DATA = "E09299";
        /**
         * 成功
         */
        public static final String SUCCESS = "200001";
        /**
         * リクエストボディ内で指定された `target_processing_id` に対応する、取引が見つからない
         */
        public static final String TRANSACTION_NOT_FOUND = "404001";
    }

    /**
     * AuPayResult
     *
     * @author zhangyd
     */
    public static class AuPayResult {

        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";
        public static final String SUCCESS_OK = "QCH10000";
        public static final String FAIL_OK = "QCH10012";
        public static final String ERROR_RESULT = "QCH90000";
        public static final String RESPONSE_EMPTY = "E09299";
        public static final String XML_NAME = "qrPayRes";
    }

    /**
     * GMOResult
     *
     * @author chengy
     */
    public static class GMOResultCode {

        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";
        public static final String RESPONSE_EMPTY = "E09299";
        public static final String INVALID_PARAM = "invalid_parameter";
        public static final String NO_ERROR = "";
        public static final String INVALID_STATUS = "invalid_status";
        public static final String TRANSACTION_NOT_FOUND = "transaction_id";
        public static final String PAYMENT_IN_PROGRESS = "PAYMENT_IN_PROGRESS";

    }

    /**
     * GMO的返回的取引状態
     *
     */
    public static class GMOResultStatus {

        // public static final String TRADE_SUCCESS = "01";
        // public static final String CANCEL_SUCCESS = "06";
        // public static final String TRADE_NOT_EXIT = "09";

        // 支払い完了
        public static final String PAID = "paid";
        // 支払い処理待ち
        public static final String PENDING = "pending";
        // 取消済み
        public static final String CANCELED = "canceled";
        // 赤伝
        public static final String CANCELING = "canceling";
        // 無効
        public static final String DISPOSED = "disposed";
    }

    /**
     * Resona constants
     */
    public static class ResonaConstants {
        public static final String TRANSACTIONTYPE = "qr";
    }

    /**
     * ResonaResult
     *
     * @author zhangyd
     */
    public static class ResonaResult {
        public static final String WAITING = "waiting";
        public static final String PROCESSING = "processing";
        public static final String SUCCESS = "success";
        public static final String FAILURE = "failure";
        public static final String CANCELED = "canceled";
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";
        public static final String TRANS_SUCCESS = "S00001";
        public static final String REFUND_SUCCESS = "R00001";
        public static final String TRANS_FAILED = "S003-0001";
        public static final String PAYMENT_IN_PROGRESS = "PAYMENT_IN_PROGRESS";
        // 以下三个与系统code重复，作特殊处理
        public static final String E02001 = "E02001";
        public static final String E02002 = "E02002";
        public static final String E02003 = "E02003";

        public static final String RESONA_400 = "RESONA400";
        public static final String RESONA_401 = "RESONA401";
        public static final String RESONA_403 = "RESONA403";
        public static final String RESONA_404 = "RESONA404";
        public static final String RESONA_406 = "RESONA406";
        public static final String RESONA_409 = "RESONA409";
        public static final String RESONA_412 = "RESONA412";
        public static final String RESONA_415 = "RESONA415";
        public static final String RESONA_500 = "RESONA500";
        public static final String RESONA_503 = "RESONA503";

        /**
         * 該当データなし
         */
        public static final String EMPTY_DATA = "E09299";
    }

    public static class JCoinResult {
        public static final String COMMUNICATION_ERROR = "E02001";
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String SUCCESS = "JCOIN00";
        public static final String EMPTY = "JCOINY3";
        public static final String PAYMENT_IN_PROGRESS = "JCOIN09";
        public static final String EMPTY_DATA = "E09299";
        public static final String Y9 = "Y9";
        public static final String PAY_Y9 = "JCOINPAYY9";
        public static final String OTHER_Y9 = "JCOINOTHERY9";
        public static final String POSDIRECT = "posdirect";
        public static final String JCOIN_SYMBOL = "JCOIN";
        public static final String PAY = "売上";
        public static final String REFUND = "返金";
        public static final String TERMID = "00001";
    }

    /**
     * BankPayResult
     *
     * @author chengy
     */
    public static class BankPayResult {
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";
        public static final String PAYMENT_IN_PROGRESS = "PAYMENT_IN_PROGRESS";
        public static final String EMPTY_DATA = "E09299";
        public static final String DEAL_TYPE_PAY = "01";
        public static final String DEAL_TYPE_CANCEL = "02";
        public static final String DEAL_SUCCESS_STATUS = "01";
        public static final String STATUS_CODE_ERROR = "STATUS_CODE_ERROR";

        public static final String BANKPAY_E110006 = "E110006";
        public static final String BANKPAY_E100098 = "E100098";
        public static final String BANKPAY_E110001 = "E110001";
        public static final String BANKPAY_E110007 = "E110007";
        public static final String BANKPAY_E110044 = "E110044";
        public static final String BANKPAY_E500098 = "E500098";

        public static final String INVALID_STATUS = "INVALID_STATUS";
    }

    /**
     * OnePayResult
     *
     * @author chengy
     *
     */
    public static class OnepayResult {
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";
        /**
         * エラーなし
         */
        public static final String SUCCESS = "00";
        /**
         * 通信異常
         */
        public static final String COMM_FAIL = "02";

        /**
         * 異常
         */
        public static final String FAIL = "09";
        /**
         * 該当データなし
         */
        public static final String EMPTY_DATA = "RESPONSE_EMPTY";
        /**
         * 支付中
         */
        public static final String PAY_IN = "03";
        /**
         * 顧客支払待ち
         */
        public static final String WAIT_USER_PAY = "14";
    }

    // --JCB start -->
    /**
     * JCBResult
     *
     * @author chengy
     *
     */
    public static class JCBResult {
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";
        /**
         * エラーなし
         */
        public static final String SUCCESS = "00";

        /**
         * 通信異常
         */
        public static final String COMM_FAIL = "02";

        /**
         * 異常
         */
        public static final String FAIL = "09";

        /**
         * ステータスコード 支払い成功
         */
        public static final String PAY_SUCCESS = "00";

        /**
         * 返金済
         */
        public static final String CANCEL_SUCCESS = "06";

        /**
         * 照会成功
         */
        public static final String CONFIRM_SUCCESS = "20";

        /**
         * 支払い失敗
         */
        public static final String PAY_FAIL = "001";

        /**
         * 存在しない支払い
         */
        public static final String PAY_NOT_EXIT = "TRADE_NOT_EXIST";

        /**
         * 処理中（JCB）
         */
        public static final String PROCESSING = "REQUEST_DUPLICATED";

        /**
         * 該当データなし
         */
        public static final String EMPTY_DATA = "E09299";

    }
    // --JCB end <--

    // 支付货币单位
    public static class PayCurrency {

        /**
         * BTC.
         */
        public static final String BTC = "BTC";

    }

    // 支付方式
    public static class PaymentMethod {

        /**
         * ISSUE-COMMON.
         */
        public static final String ISSUE_COMMON = "00";

        /**
         * 支付宝.
         */
        public static final String ALIPAY = "01";
        /**
         * 微信.
         */
        public static final String WECHAT = "02";

        /**
         * 银联.
         */
        public static final String BANK = "03";

        /**
         * LINE PAY.
         */
        public static final String LINE_PAY = "04";
        /**
         * VALUE DESIGN.
         */
        public static final String VALUE_DESIGN = "05";
        /**
         * BitCoin.
         */
        public static final String BIT_COIN = "06";
        /**
         * ORIGAMI.
         */
        public static final String ORIGAMI = "07";
        /**
         * HAPPYGO.
         */
        public static final String HAPPYGO = "08";
        /**
         * 09:楽天Pay
         */
        public static final String RAKUTEN_PAY = "09";

        /**
         * YahooPay.
         */
        public static final String YAHOO = "10";
        /**
         * DocomoPay.
         */
        public static final String DOCOMO = "11";
        /**
         * Cpay-ALIPAY.
         */
        public static final String CPAY = "13";
        /**
         * CPAY-WECHAN
         */
        public static final String CPAY_WECHANT = "14";
        /**
         * Merpay.
         */
        public static final String MERPAY = "15";
        /**
         * AuPay.
         */
        public static final String AUPAY = "16";
        /**
         * JCB(ALIPAY).
         */
        public static final String JCB_ALIPAY = "17";
        /**
         * JCB(WECHAT).
         */
        public static final String JCB_WECHAT = "J02";

        /**
         * Quo Card
         */
        public static final String QUO = "18";
        /**
         * ゆうちょPay
         */
        public static final String GMO = "19";

        /**
         * カシコン銀行
         */
        public static final String KASIKORN = "21";

        /**
         * りそなウォレット
         */
        public static final String RESONA = "22";
        /**
         * EPOS
         */
        public static final String EPOS = "23";
        /**
         * J-Coin Pay
         */
        public static final String JCOIN = "24";

        /**
         * PRING
         */
        public static final String PRING = "27";

        /**
         * ATONE
         */
        public static final String ATONE = "28";

        /**
         * AFTEE
         */
        public static final String AFTEE = "29";

        /**
         * BankPay
         */
        public static final String BANKPAY = "30";

        /**
         * PREMO PAY
         */
        public static final String PREMOPAY = "32";

        /**
         * MyJCB Pay
         */
        public static final String MYJCBPAY = "33";

        /**
         * AX Pay
         */
        public static final String AXPAY = "34";

        /**
         * MoneyTap
         */
        public static final String MoneyTap = "35";

        /**
         * FamiPay
         */
        public static final String FAMIPAY = "36";

        /**
         * みずほGW-Alipay
         */
        // public static final String MIZUHO_GW_ALIPAY = "MG01";

        /**
         * みずほGW-銀聯
         */
        public static final String MIZUHO_GW_BANK = "MG03";

        /**
         * ゲオペイ
         */
        public static final String GEOPAY = "37";

        /**
         * ララPay
         */
        public static final String RARAPAY = "40";

        /**
         * Paidy
         */
        public static final String PAIDY = "41";

        /**
         * 自動バーコード判別.
         */

        public static final String IDENTIFY_AUTO_BARCODE = "99";
        /**
         * Onepay-支付宝.
         */
        public static final String ONEPAY01 = "O01";
        /**
         * Onepay-微信.
         */
        public static final String ONEPAY02 = "O02";
        /**
         * Onepay-银联.
         */
        public static final String ONEPAY03 = "O03";
        /**
         * Onepay-LINE PAY.
         */
        public static final String ONEPAY04 = "O04";

        /**
         * Onepay-JKOpay
         */
        public static final String ONEPAY25 = "O25";
        /**
         * smart-code
         */
        public static final String SMARTCODE = "90";
        /**
         * onepay MPM ali
         */
        public static final String ONEPAYTQC01 = "M01";
        /**
         * onepay MPM wechat
         */
        public static final String ONEPAYTQC02 = "M02";
        /**
         * Line MPM
         */
        public static final String LINE_PAY_TQC = "M04";

        /**
         * paypay MPM
         */
        public static final String PAYPAY_PAY_TQC = "M10";
        /**
         * onepay OneQ(动态）
         */
        public static final String ONEPAYONEQ = "M99";
        /**
         * OnepayGN-Alipay
         */
        public static final String ONEPAYGN_ALIPAY = "GN01";
        /**
         * OnepayGN-AlipayHK
         */
        public static final String ONEPAYGN_ALIPAYHK = "GN02";
        /**
         * OnepayGN-kakaopay
         */
        public static final String ONEPAYGN_KAKAOPAY = "GN03";
        /**
         * Onepay-Alipay Connect
         */
        public static final String ONEPAYGN_CONNECT = "GN90";
        /**
         * GW-Alipay
         */
        public static final String GW_ALIPAY = "G01";
        /**
         * GW-WechatPay
         */
        public static final String GW_WECHATPAY = "G02";
        /**
         * GW_AlipayConnect
         */
        public static final String GW_ALIPAYCONNECT = "G90";
        /**
         * OL09 楽天ペイ(OL)
         */
        public static final String OL_RAKUTEN = "OL09";
        /**
         * OL11 d払い(OL)
         */
        public static final String OL_DOCOMO = "OL11";

    }

    /**
     * リクエストの種別
     *
     * @author chenhang22934
     *
     */
    public static class RakutenExecMode {
        /**
         * 利用
         */
        public static final String PAY = "0030";
        /**
         * 利用取消
         */
        public static final String REVERSE = "0040";
    }

    /**
     * RakutenResult
     *
     * @author chenhang22934
     *
     */
    public static class RakutenResult {
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";
        public static final String RESPONSE_EMPTY = "E09299";
        /**
         * 決済受入
         */
        public static final String ACCEPT_PAY = "S100";
        /**
         * 取消成功
         */
        public static final String CANCEL_SUCCESS = "S200";
        /**
         * 照会成功
         */
        public static final String CONFIRM_SUCCESS = "S300";
        /**
         * 3Dセキュア認証中
         */
        public static final String AUTHENTICATE_IN_3D = "S101";
        /**
         * 決済成功
         */
        public static final String PAY_SUCCESS = "S102";
        /**
         * 照会対象取引なし
         */
        public static final String EMPTY_DATA = "E300";
        /**
         * 照会失敗
         */
        public static final String CONFIRM_FAIL = "E301";

    }

    // 返金可否
    public static class RefundFlag {
        /**
         * 返金可.
         */
        public static final String REFUND_OK = "01";

        /**
         * 返金否.
         */
        public static final String REFUND_NG = "02";
    }

    // 退款撤销订单有效时间
    public static class RefundReverseLimitDay {
        /**
         * 退款.
         */
        public static final String REFUND = "90";

        /**
         * 撤销.
         */
        public static final String REVERSE = "7";
    }

    // 是否穿透（不送，默认值false）
    public static class Regardless {
        public static final String NO = "false";
        public static final String YES = "true";
    }

    // 取消対象の取引種別
    public static class ReqClassCanceled {

        /**
         * 入金.
         */
        public static final String DEPOSIT = "4002";

        /**
         * 利用.
         */
        public static final String WITHDRAW = "4003";
        /**
         * 返品.
         */
        public static final String SENDBACK = "4004";
        /**
         * 要求取消
         */
        public static final String REVERSE = "4007";

    }

    // 服务ID（业务代码）
    public static class ReqServiceId {
        public static final String PAY = "CPAYJPORDERADD000001";
        public static final String RECEIPT = "CPAYJPORDERPOS000001";
        public static final String ORDER_QUERY = "CPAYJPORDERQRY000001";
        public static final String DETAIL_QUERY = "CPAYJPORDERQRY000002";
        public static final String REFUND = "CPAYJPORDERREFUND000001";
        public static final String CANCEL = "CPAYJPORDERCANCEL000001";
        public static final String CONFIRM = "CPAYJPORDERCHECK000001";
    }

    // 执行结果状态码
    public static class ResultCode {
        /**
         * 成功.
         */
        public static final String SUCCESS = "00";

        /**
         * 通讯异常.
         */
        public static final String COMMUNICATION_EXCEPTION = "02";

        /**
         * 系统异常.
         */
        public static final String SYSTEM_EXCEPTION = "09";

    }

    // 执行结果信息
    public static class ResultMessage {
        /**
         * 成功.
         */
        public static final String SUCCESS = "SUCCESS";

        /**
         * 失败.
         */
        public static final String FAILURE = "FAILURE";

        /**
         * 失败.
         */
        public static final String FAIL = "FAIL";
    }

    // 执行结果信息
    public static class ResultStatus {
        /**
         * 成功.
         */
        public static final String SUCCESS = "0";

    }

    // 支付rule状态
    public static class RuleStatus {

        /**
         * 初期.
         */
        public static final String INITIAL = "01";

        /**
         * 発効.
         */
        public static final String OPEN = "02";

        /**
         * 凍結.
         */
        public static final String LOCKED = "03";

        /**
         * 失効.
         */
        public static final String EXPIRED = "09";

    }

    // SENDER类型
    public static class SenderType {
        /**
         * 支付.
         */
        public static final String PAY = "01";

        /**
         * 退款.
         */
        public static final String REFUND = "02";

        /**
         * 取消.
         */
        public static final String REVERSE = "03";
        /**
         * 入金.
         */
        public static final String DEPOSIT = "04";

        /**
         * 确认(订单查证).
         */
        public static final String ORDER_QUERY = "05";
        /**
         * 确认（退款查证）.
         */
        public static final String REFUND_QUERY = "06";
        /**
         * 入金取消.
         */
        public static final String DEPOSIT_REVERSE = "07";
        /**
         * 入金查证.
         */
        public static final String DEPOSIT_QUERY = "08";
        /**
         * 小票号上传.
         */
        public static final String RECEIPT = "07";
        /**
         * 流水查询.
         */
        public static final String DETAIL_QUERY = "08";
        /**
         * 流水查询.
         */
        public static final String CONFIRM = "09";
        /**
         * 授权
         */
        public static final String AUTHORIZE = "10";
        /**
         * 加盟店決済情報事前登録
         */
        public static final String ENTERPRISER = "11";
        /**
         * lINE MPM异步通知用confirm
         */
        public static final String LINE_NOTIFY_CONFIRM = "12";
        /**
         * paypay mpm 支付、取消查证
         */
        public static final String PAY_REVERSE_QUERY = "13";
    }

    // Cpay的serviceId
    public static class ServiceId {
        public static final String B2B = "INNERGATEWAY000012";
        public static final String B2C = "INNERGATEWAY000002";
    }

    // 服务种类(01=订单模块)
    public static class ServiceKind {
        public static final String ORDER = "01";
    }

    // 服务接入模式
    public static class ServiceMode {
        /**
         * B2B.
         */

        public static final String B2B = "B01";

        /**
         * B2C.
         */
        public static final String B2C = "C01";
    }

    // 服务类型（默认j，代表json）
    public static class ServiceType {
        public static final String JSON = "j";
    }

    // 签名方式
    public static class SignType {
        /**
         * RSA.
         */

        public static final String RSA = "0";

        /**
         * MD5.
         */
        public static final String MD5 = "1";
    }

    // 加密是否特殊处理
    public static class Special {
        public static final String NO = "0";
    }

    // 终端状态
    public static class TerminalStatus {
        /**
         * 初期.
         */
        public static final String INITIAL = "01";

        /**
         * 発効.
         */
        public static final String OPEN = "02";

        /**
         * 凍結.
         */
        public static final String LOCKED = "03";

        /**
         * 失効.
         */
        public static final String EXPIRED = "09";
    }

    // 时区
    public static class TimeZoneStr {
        /**
         * 第0区
         */
        public static final String P0 = "p0";

        /**
         * 东七区.
         */
        public static final String P7 = "p7";

        /**
         * 东八区.
         */
        public static final String P8 = "p8";

        /**
         * 东九区.
         */
        public static final String P9 = "p9";
    }

    // 对账单返回交易类型
    public static class TransType {
        /**
         * 支付.
         */
        public static final String PAY = "01";

        /**
         * 退款.
         */
        public static final String REFUND = "02";

        /**
         * 支付取消.
         */
        public static final String REVERSE = "03";
        /**
         * 入金.
         */
        public static final String DEPOSIT = "04";

        /**
         * 入金取消.
         */
        public static final String DEPOSIT_REVERSE = "05";

        /**
         * 退款取消.
         */
        public static final String REFUND_REVERSE = "06";
        /**
         * 确认
         */
        public static final String CONFIRM = "09";

    }

    // 用户锁定状态
    public static class UserLockStatus {
        /**
         * 正常.
         */
        public static final String UNLOCK = "12";

        /**
         * 锁住.
         */
        public static final String LOCK = "22";
    }

    // 店铺用户状态
    public static class UserStatus {
        /**
         * 初期.
         */
        public static final String INITIAL = "01";

        /**
         * 発効.
         */
        public static final String OPEN = "02";

        /**
         * 凍結.
         */
        public static final String LOCKED = "03";

        /**
         * 失効.
         */
        public static final String EXPIRED = "09";
    }

    // 用户类型
    public static class UserType {
        /**
         * 管理者.
         */

        public static final String ADMIN_USER = "01";

        /**
         * 一般ユーザー.
         */
        public static final String ORDINARY_USER = "02";

        /**
         * 特権管理者.
         */
        public static final String PRIVILEGE_USER = "03";
    }

    // VD返回值
    public static class VdResultCode {
        /**
         * 200.
         */
        public static final int SUCCESS = 200;

        /**
         * 201.
         */
        public static final int CANCEL_SUCCESS = 201;

        /**
         * E09299.
         */
        public static final int RESPONSE_EMPTY = 299;

        /**
         * 999.
         */
        public static final int COMMUNICATION_ERROR = 999;
        /**
         * 998.
         */
        public static final int DB_ERROR = 998;

        /**
         * 997.
         */
        public static final int HOST_UNKNOWN = 997;

        /**
         * 996.
         */
        public static final int UNKNOWN_ERROR = 996;

        /**
         * 900.
         */
        public static final int VD_SYS_ERROR = 900;

        /**
         * 404.
         */
        public static final int VD_TRAN_NOT_EXIST = 404;

    }

    /**
     * Quo的返回值
     *
     *
     */
    public static class QuoResultCode {
        public static final String COMMUNICATION_ERROR = "E02001";
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String XML_NAME = "RESPONSE";
        /**
         * 正常
         */
        public static final String SUCCESS = "0000000";
        /**
         * 存在しない支払い
         */
        public static final String TRADE_NOT_EXIT = "0080000";

        /**
         * 残高不足
         */
        public static final String NOT_ENOUGH = "0100000";
        /**
         * 該当データなし
         */
        public static final String EMPTY_DATA = "E09299";

    }

    /**
     * Quo的返回的取引状態
     *
     */
    public static class QuoResultStatus {
        /**
         * 取引成立
         */
        public static final String TRADE_SUCCESS = "01";
        /**
         * キャンセル成立
         */
        public static final String CANCEL_SUCCESS = "02";
        /**
         * 取引なし
         */
        public static final String TRADE_NOT_EXIT = "09";
    }

    // 微信返回的状态
    public static class WeChatTransState {
        /**
         * 支付成功.
         */
        public static final String SUCCESS = "SUCCESS";

        /**
         * 转入退款.
         */
        public static final String REFUND = "REFUND";

        /**
         * 未支付.
         */
        public static final String NOTPAY = "NOTPAY";

        /**
         * 已关闭.
         */
        public static final String CLOSED = "CLOSED";

        /**
         * 已撤销.
         */
        public static final String REVOKED = "REVOKED";

        /**
         * 用户支付中.
         */
        public static final String USERPAYING = "USERPAYING";

        /**
         * 未支付(输入密码或确认支付超时).
         */
        public static final String NOPAY = "NOPAY";

        /**
         * 支付失败(其他原因，如银行返回失败).
         */
        public static final String PAYERROR = "PAYERROR";
        /**
         * 退款处理中.
         */
        public static final String PROCESSING = "PROCESSING";
        /**
         * 未确定，需要商户原退款单号重新发起.
         */
        public static final String NOTSURE = "NOTSURE";
        /**
         * 转入代发，退款到银行发现用户的卡作.
         */
        public static final String CHANGE = "CHANGE";
        /**
         * 系统错误.
         */
        public static final String SYSTEME_ERROR = "SYSTEMERROR";

    }

    public static class BranchAutoSftpStatus {
        public static final String EFFECTIVE = "00";
        public static final String SHUTDOWN = "09";
    }

    /**
     * YaHoopay 常量
     *
     */
    public static class YaHooCount {
        public static final String ID_COUNT = "1";
        public static final String QTY_COUNT = "1";
    }

    /**
     * リクエストの種別
     *
     * @author chenhang22934
     *
     */
    public static class YahooExecMode {
        /**
         * 0020: 入金（未使用）
         */
        public static final String DEPOSIT = "0020";
        /**
         * 利用
         */
        public static final String PAY = "0030";
        /**
         * 利用取消
         */
        public static final String REVERSE = "0040";
    }

    // Yahoo返回结果
    public static class YahooResultCode {
        // public static final String RESPONSE_EMPTY = "E99993";
        public static final String RESPONSE_EMPTY = "E09299";
        // public static final String COMMUNICATION_ERROR = "E99999";
        // public static final String SOCKETTIMEOUT_ERROR = "E99998";
        // public static final String HOST_UNKNOWN = "E99997";
        // public static final String CONNECTTIMEOUT_ERROR = "E99996";
        // public static final String SOCKET_ERROR = "E99995";
        // public static final String COMMUNICATION_ERROR = "E99994";
        public static final String CONNECTIONPOOLTIMEOUTEXCEPTION = "E02002";
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";

        /**
         * 決済が成功
         */
        public static final String SUCCEEDED = "S00000";
        /**
         * 取消が成功、もしくは取消済
         */
        public static final String CANCELED = "S00001";
        /**
         * 対象の電文が見つかりました
         */
        public static final String REQ_IS_FOUN = "S00002";
        /**
         * 対象の電文は存在しませ
         */
        public static final String REQ_IS_NOT_FOUND = "S00003";

    }

    // paypay MPM 返回code
    public static class TqcPayPayResultCode {
        public static final String RESPONSE_EMPTY = "E09299";
        public static final String CONNECTIONPOOLTIMEOUTEXCEPTION = "E02002";
        public static final String EXTERNEL_SERVER_CONNECTION_TIMEOUT = "E02002";
        public static final String SERVER_RES_TIMEOUT = "E02003";
        public static final String COMMUNICATION_ERROR = "E02001";
        public static final String UNKNOWN_ERROR = "E09299";
        /**
         * 決済が成功
         */
        public static final String SUCCEEDED = "08100001";
        /**
         * "COMPLETED": transStatus=00 ※"COMPLETED"以外のwebfookは無し
         *
         * 元取引ステータス更新＜照合対象＞
         */
        public static final String COMPLETED = "COMPLETED";
        /**
         * E09301-TRADE_NOT_EXIST
         */
        public static final String DYNAMIC_QR_PAYMENT_NOT_FOUND = "01652075";
        /**
         * E09301-TRADE_NOT_EXIST
         */
        public static final String NO_SUCH_REFUND_ORDE = "00200018";

    }

    // paypay mpm错误信息
    public static class TqcPayPayCode {
        /**
         * Success
         */
        public static final String SUCCESS = "SUCCESS";
        /**
         * Request accepted
         */
        public static final String REQUEST_ACCEPTED = "REQUEST_ACCEPTED";
        /**
         * CREATED
         */
        public static final String CREATED = "CREATED";
        /**
         * REFUNDED
         */
        public static final String REFUNDED = "REFUNDED";
        /**
         * REFUND_FAILED
         */
        public static final String REFUND_FAILED = "REFUND_FAILED";
        /**
         * AUTHORIZED
         */
        public static final String AUTHORIZED = "AUTHORIZED";
        /**
         * REAUTHORIZING
         */
        public static final String REAUTHORIZING = "REAUTHORIZING";
        /**
         * FAILED
         */
        public static final String FAILED = "FAILED";
        /**
         * CANCELED
         */
        public static final String CANCELED = "CANCELED";
        /**
         * EXPIRED
         */
        public static final String EXPIRED = "EXPIRED";
        /**
         * TRANSACTION_ERROR
         */
        public static final String TRANSACTION_ERROR = "08100001-REFUND_FAILED";
    }

    /**
     * paypay取得ファイル結果コード.
     *
     */
    public static class PayPayFileStatus {
        /**
         * 決済完了
         */
        public static final String PAID_OK = "取引完了";
        /**
         * 決済失敗
         */
        public static final String PAID_FAIL = "取引失敗";
        /**
         * 取消完了
         */
        public static final String REFUND_OK = "返金完了";
        /**
         * 取消失敗
         */
        public static final String REFUND_FAIL = "返金失敗";

    }

    /**
     * AuPayリクエストの種別
     *
     * @author zhangyd24942
     *
     */
    public static class AuPayExecMode {
        /**
         * 0002: 支払
         */
        public static final String PAY = "0002";
        /**
         * 0005：支払取消(全額取消)
         */
        public static final String FULL_REFUND = "0005";
        /**
         * 0006：支払取消(部分取消)
         */
        public static final String PARTIAL_REFUND = "0006";
    }

    public static class IdentifyAutoBarcodeFlg {

        public static final String IDENTIFYAUTOBARCODE_OK = "01";

        public static final String IDENTIFYAUTOBARCODE_NO = "02";
    }

    /**
     *
     * sftp中提供的支付方式code的所属系统，PAYTREE表示是本系统的支付方式code，目前只有JCN和PAYTREE 情报自动登录，sftp情报登录机能，对应DB org_inherent_paytype_code字段
     */
    public static class InherentPayTypeCode {
        public static final String PAYTREE = "00";
        public static final String JCN = "01";
    }

    public static final String ERROR_INFO_UNKNOWN = "UNKNOWNERROR";

    // 交易类型
    public static final String B2B_STRING = "B2B";
    public static final String PAYTREE = "PAYTREE";

    // Cpay订单已取消
    public static final String CPAY_ALREADY_CANCELED = "0TE110006032";

    // 申请系统管理员权限
    public static final String SERVICE_ROLE = "02";

    // ステータス
    /**
     * 初期.
     */
    public static final String INITIAL = "01";

    /**
     * 発効.
     */
    public static final String OPEN = "02";

    /**
     * 凍結.
     */
    public static final String LOCKED = "03";

    /**
     * 失効.
     */
    public static final String EXPIRED = "09";

    // 支払ルール 类别
    /**
     * 加盟店支付channel.
     */
    public static final String RULE_BRANCH = "01";

    /**
     * 代理商支付channel.
     */
    public static final String RULE_AGENT = "02";

    public static final String SESSION_KEY_ADMIN_USER = "ADMINUSER";

    public static final String SESSION_KEY_ROLES = "ROlES";

    public static final String SESSION_KEY_PERMISSIONS = "PERMISSIONS";

    public static final String SESSION_KEY_LOGIN_TIME = "LOGINTIME";

    public static final String SESSION_KEY_COPYRIGHT_TIME = "COPYRIGHTTIME";

    public static final String SESSION_IS_SYSTEM_GRADE = "ISSYSTEMGRADE";

    public static final String SESSION_IS_AGENT_GRADE = "ISAGENTGRADE";

    public static final String SESSION_IS_BRANCH_GRADE = "ISBRANCHGRADE";

    public static final String SESSION_IS_SHOP_GRADE = "ISSHOPGRADE";

    public static final char SEPARATOR_COMMA_CHAR = ',';

    public static final String SEPARATOR_COMMA = ",";

    public static final String SEPARATOR_APOSTROPHE = "`";

    public static final String SEPARATOR_4_WC_BILL = SEPARATOR_COMMA + SEPARATOR_APOSTROPHE;

    public static final String SEPARATOR_4_ALIPAY_TQC_BILL = "\\|";
    public static final String SEPARATOR_HYPHEN = "-";
    public static final String SEPARATOR_UNDERLINE = "_";
    public static final String CHARSET_UTF8 = "UTF-8";
    public static final String MNG_CENTER_FUNCTION_CODE = "2";
    public static final String BUSINESSMAN = "999999999";
    public static final String EXCEL_FONT_NAME = "ＭＳ Ｐゴシック";
    public static final String TIME_START = "000000";
    public static final String TIME_END = "235959";
    // 验证码
    public static final String CAPTCHA = "captcha";

    // Batch执行时填写的操作员
    public static final String BATCH_OPERATOR = "batch-operator";

    // 文件后缀
    public static final String FIELD_FILE_SUFFIX_ZIP = ".zip";

    public static final String FIELD_FILE_SUFFIX_EXCEL = ".xlsx";

    public static final String FIELD_FILE_SUFFIX_PDF = ".pdf";

    public static final String FIELD_FILE_SUFFIX_CSV = ".csv";

    // 下拉表最多件数
    public static final int MAX_SELECT_NUM = 100;

    /**
     * app类型.
     *
     * @return 状态Map
     */
    public static Map<String, String> getAppStatusMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "初期");
        map.put("02", "発効");
        map.put("03", "凍結");
        map.put("09", "失効");
        return map;
    }

    /**
     * 地域コード.
     *
     * @return 地域コードMap
     */
    public static Map<String, String> getAreaCodeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "日本");
        return map;
    }

    /**
     * 精算ステータス.
     *
     * @return Map
     */
    public static Map<String, String> getClearingStatusMap() {
        final Map<String, String> map = new HashMap<>();
        map.put(ClearingStatus.FAIL, "精算失敗");
        map.put(ClearingStatus.SUCCESS, "精算成功");
        map.put(ClearingStatus.REDO, "再精算");
        map.put(ClearingStatus.OUT, "精算対象外");
        map.put(ClearingStatus.NO_CLEARING, "未精算");
        return map;
    }

    /**
     * 累計/日别 フェイル方式
     *
     * @return map
     */
    public static Map<String, String> getCreateFileType() {
        final Map<String, String> map = new HashMap<>();
        map.put(CreateFileType.HIBETU, "日別");
        map.put(CreateFileType.RUIKEI, "累計  ");
        return map;
    }

    /**
     * 作成ステータス.
     *
     * @return Map
     */
    public static Map<String, String> getCreateStatusMap() {
        final Map<String, String> map = new HashMap<>();
        map.put(CreateStatus.FAIL, "作成失敗");
        map.put(CreateStatus.SUCCESS, "作成成功");
        map.put(CreateStatus.OUT, "作成対象外");
        return map;
    }

    /**
     * 預金種目.
     *
     * @return Map
     */
    public static Map<String, String> getDepositTypeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("1", "普通");
        map.put("2", "当座");
        map.put("4", "貯蓄");
        map.put("9", "その他");
        return map;
    }

    /**
     * ファイルフォーマット設定
     *
     * @return Map
     */
    public static Map<String, String> getTradeFileTypeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "デフォルトフォーマット");
        return map;
    }

    /**
     * データ出力ルール
     *
     * @return Map
     */
    public static Map<String, String> getPeriodMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("02", "T-2");
        map.put("01", "T-1");
        map.put("00", "T-0");
        return map;
    }

    public static class SysTradeFileStatus {
        public static final String CREATING = "00";
        public static final String ACCOMPLISHED = "01";
        public static final String CREATE_FAILED = "02";
        public static final String UPLOAD_FAILED = "03";
    }

    public static Map<String, String> getSysTradeFileStatus() {
        final Map<String, String> map = new HashMap<>();
        map.put("00", "作成中");
        map.put("01", "成功");
        map.put("02", "作成失敗");
        map.put("03", "アップロード失敗");
        return map;
    }

    /**
     * 締め時刻選択
     *
     * @return Map
     */
    public static Map<String, String> getTradeEndTimeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("00:00", "00:00");
        map.put("23:00", "23:00");
        map.put("22:00", "22:00");
        map.put("21:00", "21:00");
        map.put("20:00", "20:00");
        map.put("19:00", "19:00");
        map.put("18:00", "18:00");
        map.put("17:00", "17:00");
        map.put("16:00", "16:00");
        map.put("15:00", "15:00");
        map.put("14:00", "14:00");
        map.put("13:00", "13:00");
        map.put("12:00", "12:00");
        map.put("11:00", "11:00");
        map.put("10:00", "10:00");
        map.put("09:00", "09:00");
        map.put("08:00", "08:00");
        map.put("07:00", "07:00");
        map.put("06:00", "06:00");
        map.put("05:00", "05:00");
        map.put("04:00", "04:00");
        map.put("03:00", "03:00");
        map.put("02:00", "02:00");
        map.put("01:00", "01:00");
        return map;
    }

    /**
     * HTTP種類.
     *
     * @return Map
     */
    public static Map<String, String> getHttpTypeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "http");
        map.put("02", "https");
        return map;
    }

    /**
     * Keｙ利用状況.
     *
     * @return Map
     */
    public static Map<String, String> getKeyStatusMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "はい");
        map.put("02", "いいえ");
        return map;
    }

    /**
     * log生成时操作项
     *
     * @return
     */
    public static Map<String, String> getOperationItemMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("001", "取引明細照会(直近90日分)");
        map.put("002", "オーダー照会");
        map.put("003", "決済機関取引確認");
        map.put("004", "取引集計照会(直近90日分)");
        map.put("005", "アクワイアラ情報");
        map.put("006", "支払チャンネル情報");
        map.put("007", "加盟店情報");
        map.put("008", "店舗情報");
        map.put("009", "端末情報");
        map.put("010", "ユーザ情報");
        map.put("011", "管理者情報管理");
        map.put("012", "アクセス制限管理");
        map.put("013", "ロール管理");
        map.put("014", "APPバージョン管理");
        map.put("015", "決済機関アカウント管理");
        map.put("016", "支払明細票 兼 売上票");
        map.put("017", "決済機関精算書");
        map.put("018", "総振依頼データ");
        map.put("019", "操作ログ");
        map.put("020", "マイページ");
        map.put("021", "精算不一致");
        map.put("022", "JCB汎用スキーム精算データ");
        map.put("023", "JCB汎用スキーム加盟店データ");
        map.put("024", "自動判別設定");
        map.put("025", "公開キー交換");
        map.put("026", "取引明細ファイル/実績データ");
        map.put("027", "KDDI店舗情報");
        map.put("028", "JCB店舗情報");
        map.put("029", "取引明細照会(13ヶ月前~90日前)");
        map.put("030", "取引集計照会(13ヶ月前~90日前)");
        map.put("031", "申請システム連携");
        map.put("032", "イシュア照合");
        map.put("033", "エラーコード設定");
        map.put("035", "アラート自動発報");
        map.put("036", "アクワイアラ付替え");
        map.put("037", "支払チャンネル一括アップロード");
        map.put("038", "取引ログ");
        map.put("039", "Bank Pay端末識別番号情報");
        map.put("040", "自動登録情報設定");
        map.put("041", "自動取込管理");
        map.put("042", "申請ステータス");
        map.put("043", "お知らせ発信（端末向け）");
        return map;
    }

    /**
     * log生成时操作区分
     *
     * @return
     */
    public static Map<String, String> getOperationTypeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "一覧画面初期化");
        map.put("02", "追加画面初期化");
        map.put("03", "修正画面初期化");
        map.put("04", "メイン情報修正画面初期化");
        map.put("05", "明細画面初期化");
        map.put("06", "支払チャンネル設定画面初期化");
        map.put("07", "権限配分画面初期化");
        map.put("08", "役割配分画面初期化");
        map.put("09", "追加");
        map.put("10", "修正");
        map.put("11", "メイン情報修正");
        map.put("12", "削除");
        map.put("13", "支払チャンネル設定");
        map.put("14", "ロック");
        map.put("15", "ロック解除");
        map.put("16", "パスワードリセット");
        map.put("17", "役割配分");
        map.put("18", "権限配分");
        map.put("19", "再生成");
        map.put("20", "EXCELダウンロード");
        map.put("21", "CSVダウンロード");
        map.put("22", "PDFダウンロード");
        map.put("23", "マイページ初期化");
        map.put("24", "パスワード変更画面初期化");
        map.put("25", "パスワード変更");
        map.put("26", "取引明細検索画面初期化");
        map.put("27", "強制返金");
        map.put("28", "再精算");
        map.put("29", "公開キーダウンロード");
        map.put("31", "再アップロード");
        map.put("32", "ロール設定画面初期化");
        map.put("33", "取引明細ファイル/実績データ情報設定画面初期化");
        map.put("34", "ファイルアップロード");
        map.put("35", "ファイルダウンロード");
        map.put("36", "再更新");
        map.put("37", "インポート");
        map.put("38", "申請データダウンロード");
        map.put("39", "ダウンロードログ");
        map.put("40", "プレビュー");
        map.put("41", "再ダウンロード");
        map.put("42", "取込実行/取込しない");
        map.put("43", "ロール設定");
        map.put("44", "承認");
        map.put("45", "承認画面初期化");
        map.put("46", "ダウンロード");
        map.put("47", "端末ID認証");
        map.put("48", "管理者用EXCELダウンロード");
        map.put("49", "ダウンロードエラーファイル");
        map.put("51", "取引明細ファイル/実績データ情報設定");

        map.put("53", "加盟店支払チャネル一覧Excelダウンロード");
        map.put("54", "加盟店一覧Excelダウンロード");
        map.put("55", "復元");
        map.put("56", "確定");
        map.put("57", "振込手数料控除ツール");
        map.put("58", "優先順位調整画面初期化");
        map.put("59", "優先順位調整");
        map.put("60", "取消");
        map.put("61", "ステータス変更");
        map.put("62", "開始");
        map.put("63", "停止");
        return map;
    }

    /**
     * 获取交易状态.
     *
     * @return 交易状态Map
     */
    public static Map<String, String> getOrderStateMap() {
        final Map<String, String> map = new TreeMap<>();
        map.put(OrderState.PAY_SUCCESS, "支払成功");
        map.put(OrderState.PAY_FAIL, "支払失敗");
        map.put(OrderState.PAY_WAIT, "支払待ち");
        map.put(OrderState.PAY_IN, "支払中");
        map.put(OrderState.PAY_OVERTIME, "支払タイムアウト");
        map.put(OrderState.REFUND_IN, "返金中");
        map.put(OrderState.REFUND_OK, "返金済");
        map.put(OrderState.REFUND_FAIL, "返金失敗 ");
        map.put(OrderState.REFUND_OVERTIME, "返金タイムアウト");
        map.put(OrderState.CANCEL_IN, "支払取消中");
        map.put(OrderState.CANCEL_SUCCESS, "支払取消成功");
        map.put(OrderState.CANCEL_FAIL, "支払取消失敗");
        map.put(OrderState.CANCEL_OVERTIME, "支払取消タイムアウト ");
        map.put(OrderState.ORDER_CLOSE, "オーダクローズ");
        map.put(OrderState.WAIT_USER_PAY, "顧客支払待ち");
        map.put(OrderState.USER_CANCEL, "顧客支払中止");
        map.put(OrderState.DEPOSIT_IN, "入金中 ");
        map.put(OrderState.DEPOSIT_OVERTIME, "入金タイムアウト");
        map.put(OrderState.DEPOSIT_SUCCESS, "入金成功");
        map.put(OrderState.DEPOSIT_FAIL, "入金失敗");
        map.put(OrderState.REFUND_REVERSE_IN, "返金取消中");
        map.put(OrderState.REFUND_REVERSE_SUCCESS, "返金取消成功");
        map.put(OrderState.REFUND_REVERSE_FAIL, "返金取消失敗");
        map.put(OrderState.REFUND_REVERSE_OVERTIME, "返金取消タイムアウト");
        map.put(OrderState.DEPOSIT_REVERSE_IN, "入金取消中");
        map.put(OrderState.DEPOSIT_REVERSE_SUCCESS, "入金取消成功");
        map.put(OrderState.DEPOSIT_REVERSE_FAIL, "入金取消失敗");
        map.put(OrderState.DEPOSIT_REVERSE_OVERTIME, "入金取消タイムアウト");
        return map;
    }

    /**
     * * @return 交易成功的状态Map
     */
    public static Map<String, String> getOrderSuccessStateMap() {
        final Map<String, String> map = new TreeMap<>();
        map.put(OrderState.PAY_SUCCESS, "支払成功");
        map.put(OrderState.REFUND_OK, "返金済");
        map.put(OrderState.CANCEL_SUCCESS, "支払取消成功");
        map.put(OrderState.DEPOSIT_SUCCESS, "入金成功");
        map.put(OrderState.REFUND_REVERSE_SUCCESS, "返金取消成功");
        map.put(OrderState.DEPOSIT_REVERSE_SUCCESS, "入金取消成功");
        return map;
    }

    /**
     * 支付渠道状态.
     *
     * @return Map
     */
    public static Map<String, String> getPayChannelStatusMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "初期");
        map.put("02", "有効");
        return map;
    }

    /**
     * 汎用＆独自の名称表示.
     *
     * @return Map
     */
    public static Map<String, String> getSchemeTypeNameMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("0", "");
        map.put("1", "汎用");
        return map;
    }

    /**
     * デジタル署名.
     *
     * @return Map
     */
    public static Map<String, String> getPayChannelSignTypeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("0", "RSA");
        map.put("1", "MD5");
        return map;
    }

    /**
     * 支付方法.
     *
     * @return Map
     */
    public static Map<String, String> getPayTypeMap() {
        final Map<String, String> map = new LinkedHashMap<>();
        // map.put(PaymentMethod.ALIPAY, "Alipay");
        map.put(PaymentMethod.WECHAT, "Wechat");
        map.put(PaymentMethod.LINE_PAY, "Line Pay");
        map.put(PaymentMethod.VALUE_DESIGN, "地域電子マネー");
        map.put(PaymentMethod.BIT_COIN, "Bitcoin");
        map.put(PaymentMethod.ORIGAMI, "Origami Pay");
        map.put(PaymentMethod.HAPPYGO, "HappyGO");
        map.put(PaymentMethod.RAKUTEN_PAY, "楽天ペイ");
        map.put(PaymentMethod.YAHOO, "PayPay");
        map.put(PaymentMethod.DOCOMO, "d払い");
        map.put(PaymentMethod.CPAY, "Cpay-Alipay");
        map.put(PaymentMethod.CPAY_WECHANT, "Cpay-Wechat");
        map.put(PaymentMethod.MERPAY, "メルペイ");
        map.put(PaymentMethod.AUPAY, "au Pay");
        map.put(PaymentMethod.JCB_ALIPAY, "JCB-Alipay");
        map.put(PaymentMethod.QUO, "Quoカード");
        map.put(PaymentMethod.GMO, "ゆうちょPay");
        map.put(PaymentMethod.KASIKORN, "K PLUS");
        map.put(PaymentMethod.RESONA, "りそなウォレット");
        map.put(PaymentMethod.EPOS, "EPOS Pay");
        map.put(PaymentMethod.JCOIN, "J-Coin Pay");
        map.put(PaymentMethod.MIZUHO_GW_BANK, "みずほGW-銀聯");
        map.put(PaymentMethod.PRING, "pring");
        map.put(PaymentMethod.ATONE, "atone");
        map.put(PaymentMethod.AFTEE, "AFTEE");
        map.put(PaymentMethod.BANKPAY, "Bank Pay");
        map.put(PaymentMethod.PREMOPAY, "プレモコード払い");
        map.put(PaymentMethod.MYJCBPAY, "MyJCB Pay");
        map.put(PaymentMethod.AXPAY, "ANA Pay （コード払い）");
        map.put(PaymentMethod.MoneyTap, "Money Tap");
        map.put(PaymentMethod.FAMIPAY, "FamiPay");
        map.put(PaymentMethod.GEOPAY, "ゲオペイ");
        map.put(PaymentMethod.RARAPAY, "ララPay");
        map.put(PaymentMethod.PAIDY, "Paidy");
        map.put(PaymentMethod.GW_ALIPAY, "GW-Alipay");
        map.put(PaymentMethod.GW_WECHATPAY, "GW-WechatPay");
        map.put(PaymentMethod.GW_ALIPAYCONNECT, "GW-Alipay Connect");
        map.put(PaymentMethod.ONEPAYGN_ALIPAY, "OnepayGN-Alipay");
        map.put(PaymentMethod.ONEPAYGN_ALIPAYHK, "OnepayGN-AlipayHK");
        map.put(PaymentMethod.ONEPAYGN_KAKAOPAY, "OnepayGN-kakaopay");
        map.put(PaymentMethod.ONEPAYGN_CONNECT, "Onepay-Alipay Connect");
        map.put(PaymentMethod.ONEPAYTQC01, "Alipay(MPM)");
        map.put(PaymentMethod.ONEPAYTQC02, "WechatPay(MPM)");
        map.put(PaymentMethod.LINE_PAY_TQC, "Line Pay(MPM)");
        map.put(PaymentMethod.PAYPAY_PAY_TQC, "PayPay(MPM)");
        map.put(PaymentMethod.OL_RAKUTEN, "楽天ペイ(OL)");
        map.put(PaymentMethod.OL_DOCOMO, "d払い(OL)");
        map.put(PaymentMethod.ONEPAY01, "Onepay-Alipay");
        map.put(PaymentMethod.ONEPAY02, "Onepay-Wechat");
        map.put(PaymentMethod.ONEPAY03, "Onepay-銀聯");
        map.put(PaymentMethod.ONEPAY25, "Onepay-JKOPay");
        // map.put(PaymentMethod.ONEPAY04, "Onepay-Line Pay");

        return map;
    }

    /**
     * バーコード自動判別ルール支付方法.
     *
     * @return Map
     */
    public static Map<String, String> getIdentifyAutoBarcodeRuleSupportPayTypeMap() {
        final Map<String, String> map = new LinkedHashMap<>();
        map.put(PaymentMethod.ALIPAY, "Alipay");
        map.put(PaymentMethod.WECHAT, "Wechat");
        map.put(PaymentMethod.BANK, "銀聯");
        map.put(PaymentMethod.LINE_PAY, "Line Pay");
        map.put(PaymentMethod.VALUE_DESIGN, "地域電子マネー");
        map.put(PaymentMethod.BIT_COIN, "Bitcoin");
        map.put(PaymentMethod.ORIGAMI, "Origami Pay");
        map.put(PaymentMethod.HAPPYGO, "HappyGO");
        map.put(PaymentMethod.RAKUTEN_PAY, "楽天ペイ");
        map.put(PaymentMethod.YAHOO, "PayPay");
        map.put(PaymentMethod.DOCOMO, "d払い");
        map.put(PaymentMethod.MERPAY, "メルペイ");
        map.put(PaymentMethod.AUPAY, "au Pay");
        map.put(PaymentMethod.QUO, "Quoカード");
        map.put(PaymentMethod.GMO, "ゆうちょPay");
        map.put(PaymentMethod.KASIKORN, "K PLUS");
        map.put(PaymentMethod.RESONA, "りそなウォレット");
        map.put(PaymentMethod.EPOS, "EPOS Pay");
        map.put(PaymentMethod.JCOIN, "J-Coin Pay");
        map.put(PaymentMethod.PRING, "pring");
        map.put(PaymentMethod.ATONE, "atone");
        map.put(PaymentMethod.AFTEE, "AFTEE");
        map.put(PaymentMethod.BANKPAY, "BankPay");
        map.put(PaymentMethod.PREMOPAY, "プレモコード払い");
        map.put(PaymentMethod.MYJCBPAY, "MyJCB Pay");
        map.put(PaymentMethod.AXPAY, "ANA Pay （コード払い）");
        map.put(PaymentMethod.MoneyTap, "Money Tap");
        map.put(PaymentMethod.FAMIPAY, "FamiPay");
        map.put(PaymentMethod.ONEPAY25, "JKOPay");
        map.put(PaymentMethod.GEOPAY, "ゲオペイ");
        map.put(PaymentMethod.RARAPAY, "ララPay");
        map.put(PaymentMethod.PAIDY, "Paidy");
        // map.put(PaymentMethod.CPAY, "Cpay-Alipay");
        // map.put(PaymentMethod.ONEPAY01, "Onepay-Alipay");
        // map.put(PaymentMethod.ONEPAY02, "Onepay-Wechat");
        // map.put(PaymentMethod.ONEPAY04, "Onepay-Line Pay");
        return map;
    }

    // 返金エラーメッセージ
    public static Map<String, String> getRefundErrMsgMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("E09101", "システム不具合があります。センターにお問合せお願いします。");
        map.put("E09102", "システム不具合があります。センターにお問合せお願いします。");
        map.put("E09103", "システム不具合があります。センターにお問合せお願いします。");
        map.put("E09104", "入力したログイン情報が誤っています。");
        map.put("E09105", "パスワード修正が失敗しました。");
        map.put("E09106", "システム不具合があります。センターにお問合せお願いします。");
        map.put("E09107", "プロダクトキー認証に失敗しました。");
        map.put("E09108", "システム不具合があります。センターにお問合せお願いします。");
        map.put("E09109", "返金金額は1～999999999範囲内の半角数字ではありません");
        map.put("E09114", "注文の有効期間が時間切れです。");
        map.put("E09115", "リクエストパラメータ異常，通貨は有効ではありません。");
        map.put("E09120", "返金金額の通貨が不正です。");
        map.put("E09121", "すでに取消をしたため、返金できません。");
        map.put("E09123", "返金可能な額を超過しました。");
        map.put("E09128", "返金金額が不正です。");
        map.put("E09201", "システム不具合があります。センターにお問合せお願いします。");
        map.put("E09202", "システム不具合があります。センターにお問合せお願いします。");
        map.put("E09901", "システム不具合があります。センターにお問合せお願いします。");
        map.put("APPID_NOT_EXIST", "システム不具合があります。センターにお問合せお願いします。");
        map.put("AUTH_CODE_ERROR", "バーコードをリフレッシュしてから再度支払を実行してください。");
        map.put("AUTH_CODE_INVALID", "バーコードをリフレッシュしてから再度支払を実行してください。");
        map.put("AUTHCODEEXPIRE", "バーコードをリフレッシュしてから再度支払を実行してください。");
        map.put("BANKERROR", "システム不具合があります。センターにお問合せお願いします。");
        map.put("BUYER_MISMATCH", "システム不具合があります。センターにお問合せお願いします。");
        map.put("HOST_NOT_SPECIFIED", "システム不具合があります。センターにお問合せお願いします。");
        map.put("HOST_UNKNOWN", "システム不具合があります。センターにお問合せお願いします。");
        map.put("INVALID_TRANSACTIONID", "システム不具合があります。センターにお問合せお願いします。");
        map.put("LACK_PARAMS", "システム不具合があります。センターにお問合せお願いします。");
        map.put("MCHID_NOT_EXIST", "システム不具合があります。センターにお問合せお願いします。");
        map.put("MCHID_SUB_MCH_ID_NOT_MATCH", "システム不具合があります。センターにお問合せお願いします。");
        map.put("NOAUTH", "システム不具合があります。センターにお問合せお願いします。");
        map.put("NOT_UTF8", "システム不具合があります。センターにお問合せお願いします。");
        map.put("NOTENOUGH", "顧客の残高が不足です、お客さんにカード変更を提示してください。");
        map.put("NOTSUPORTCARD", "顧客のカードをサポートしません、お客さんにカード変更を提示してください。");
        map.put("ORDERCLOSED", "システム不具合があります。センターにお問合せお願いします。");
        map.put("ORDERNOTEXIST", "システム不具合があります。センターにお問合せお願いします。");
        map.put("ORDERPAID", "システム不具合があります。センターにお問合せお願いします。");
        map.put("ORDERREVERSED", "システム不具合があります。センターにお問合せお願いします。");
        map.put("OUT_TRADE_NO_USED", "システム不具合があります。センターにお問合せお願いします。");
        map.put("PARAM_ERROR", "システム不具合があります。センターにお問合せお願いします。");
        map.put("PARAM_FORMAT_ERROR", "システム不具合があります。センターにお問合せお願いします。");
        map.put("PARAM_LENGTH_ERROR", "システム不具合があります。センターにお問合せお願いします。");
        map.put("REFUNDNOTEXIST", "システム不具合があります。センターにお問合せお願いします。");
        map.put("REQUIRE_POST_METHOD", "システム不具合があります。センターにお問合せお願いします。");
        map.put("RESPONSE_EMPTY", "システム不具合があります。センターにお問合せお願いします。");
        map.put("REVERSE_EXPIRE", "システム不具合があります。センターにお問合せお願いします。");
        map.put("SIGNERROR", "システム不具合があります。センターにお問合せお願いします。");
        map.put("SUB_MCHID_MCHID_SAME", "システム不具合があります。センターにお問合せお願いします。");
        map.put("SUB_MCHID_SUB_APPID_NOT_MATCH", "システム不具合があります。センターにお問合せお願いします。");
        map.put("SYSTEMERROR", "システム不具合があります。センターにお問合せお願いします。");
        map.put("USER_ACCOUNT_ABNORMAL", "システム不具合があります。センターにお問合せお願いします。");
        map.put("USERPAYING", "システム不具合があります。センターにお問合せお願いします。");
        map.put("XML_FORMAT_ERROR", "システム不具合があります。センターにお問合せお願いします。");
        map.put("UNKOWNERROR", "システム不具合があります。センターにお問合せお願いします。");
        map.put("E02001", "通信異常が発生しました。");
        map.put("E02002", "通信異常が発生しました。");
        map.put("E02003", "通信異常が発生しました。");
        return map;
    }

    /**
     * 执行结果状态码
     *
     * @return 执行结果状态码Map
     */
    public static Map<String, String> getResultCodeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("00", "成功");
        map.put("02", "通信異常");
        map.put("09", "システム異常");
        return map;
    }

    /**
     * グレード (roleType).
     *
     * @return Map
     */
    public static Map<String, String> getRoleTypeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put(Grade.SYSTEM_GRADE, "システム管理");
        map.put(Grade.AGENT_GRADE, "アクワイアラ");
        map.put(Grade.BRANCH_GRADE, "加盟店");
        map.put(Grade.SHOP_GRADE, "店舗");
        return map;
    }

    /**
     * 店铺类型.
     *
     * @return 店铺状态Map
     */
    public static Map<String, String> getShopStatusMap() {
        final Map<String, String> map = new LinkedHashMap<>();
        map.put("02", "発効");
        map.put("01", "初期");
        map.put("03", "凍結");
        map.put("09", "失効");
        return map;
    }

    /**
     * 端末ステータス.
     *
     * @return Map 终端信息
     */
    public static Map<String, String> getTerminalStatusMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "初期");
        map.put("02", "発効");
        map.put("03", "凍結");
        map.put("09", "失効");
        return map;
    }

    /**
     * 端末種類.
     *
     * @return Map
     */
    public static Map<String, String> getTerminalTypeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "android");
        map.put("02", "apple");
        return map;
    }

    /**
     * 终端用户类型.
     *
     * @return 终端状态Map
     */
    public static Map<String, String> getTerminalUserStatusMap() {
        final Map<String, String> map = new LinkedHashMap<>();
        map.put("02", "発効");
        map.put("01", "初期");
        map.put("03", "凍結");
        map.put("09", "失効");
        return map;
    }

    /**
     * 时区.
     *
     * @return 时区List
     */
    public static List<String> getTimeZoneList() {
        final List<String> list = new ArrayList<>();
        for (int i = 0; i <= 12; i++) {
            list.add("p" + i);
            list.add("n" + i);
        }
        return list;
    }

    /**
     * 振依頼データタイプ.
     *
     * @return Map
     */
    public static Map<String, String> getTransferDataTypeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "全銀協");
        map.put("02", "楽天銀行");
        return map;
    }

    /**
     * 获取交易类型.
     *
     * @return 交易类型Map
     */
    public static Map<String, String> getTransTypeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put(TransType.PAY, "支払");
        map.put(TransType.REFUND, "返金");
        map.put(TransType.REVERSE, "支払取消");
        map.put(TransType.DEPOSIT, "入金");
        map.put(TransType.DEPOSIT_REVERSE, "入金取消");
        map.put(TransType.REFUND_REVERSE, "返金取消");
        map.put(TransType.CONFIRM, "確認");
        return map;
    }

    /**
     * 获取交易类型.(取引明细页面取引種別下拉框去除确认选择)
     * 
     * 2021/02/02 ID1003093
     * 
     * @return 交易类型Map
     */
    public static Map<String, String> getTransTypeNoConfirmMap() {
        final Map<String, String> map = new HashMap<>();
        map.put(TransType.PAY, "支払");
        map.put(TransType.REFUND, "返金");
        map.put(TransType.REVERSE, "支払取消");
        map.put(TransType.DEPOSIT, "入金");
        map.put(TransType.DEPOSIT_REVERSE, "入金取消");
        map.put(TransType.REFUND_REVERSE, "返金取消");
        return map;
    }

    /**
     * 上传方式类型.
     *
     * @return
     */
    public static Map<String, String> getUploadTypeMap() {
        final Map<String, String> map = new HashMap<>();
        // map.put("01", "クラウドストレージOSS");
        map.put("02", "ローカルサーバ");
        return map;
    }

    /**
     * ユーザ ステータス.
     *
     * @return Map
     */
    public static Map<String, String> getUserStatusMap() {
        final Map<String, String> map = new LinkedHashMap<>();
        map.put(TerminalStatus.OPEN, "発効");
        map.put(TerminalStatus.INITIAL, "初期");
        map.put(TerminalStatus.LOCKED, "凍結");
        map.put(TerminalStatus.EXPIRED, "失効");
        return map;
    }

    /**
     * 获取用户类型.
     *
     * @return Map
     */
    public static Map<String, String> getUserTypeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put(UserType.ADMIN_USER, "管理者");
        map.put(UserType.ORDINARY_USER, "一般ユーザー");
        map.put(UserType.PRIVILEGE_USER, "特権管理者");
        return map;
    }

    public static Map<String, String> getUserTypeMap1() {
        final Map<String, String> map = new HashMap<>();
        map.put(UserType.ADMIN_USER, "管理者");
        map.put(UserType.ORDINARY_USER, "一般ユーザー");
        return map;
    }

    /**
     * ip限制类型.
     *
     * @return ip限制Map
     */
    public static Map<String, String> loginIpStatusMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "初期");
        map.put("02", "発効");
        map.put("03", "凍結");
        map.put("09", "失効");
        return map;
    }

    /**
     * 支払ブランド.
     *
     * @return Map
     */
    public static Map<String, String> getPaytypeFromBrandMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("JCP", "24");
        map.put("ALP", "MG01");
        map.put("UPI", "MG03");
        return map;
    }

    /**
     * 接口 扩展字段信息
     *
     *
     */
    public static class ExtendedFieldData {
        public static final String VERSION = "version";
        public static final String PAY_VERSION = "payVersion";
        public static final String CONFIRM_VERSION = "confirmVersion";
        public static final String ORDER_QUERY_VERSION = "orderQueryVersion";
        public static final String TERMINAL_QUERY_VERSION = "terminalQueryVersion";
        public static final String TQC_VERSION = "tqcVersion";
        public static final Double VERSION11 = 1.1;
        public static final Double VERSION_BASIC = 0.0;
    }

    /**
     * CodeMaster表
     *
     *
     */
    public static class CodeMasterKeyType {
        public static final String PAY_TYPE = "payType";
        // 支付方式组合
        public static final String PAY_TYPE_GROUP = "pay_type_group";
        // mcc入力项组合
        public static final String MCC_CHECK_GROUP = "mcc_check_group";
        // 终端支付网点
        public static final String TERMINAL_PAYSITE = "terminalPaysite";
        // oneQ支持的支付方式
        public static final String ONEQ_SUPPORT_PAY_TYPE = "oneq_support_pay_type";
        // 动态oneQ支持的支付方式
        public static final String DYNAMIC_ONEQ_SUPPORT_PAY_TYPE = "dynamic_oneq_support_pay_type";
        // 决济机关gateway网关
        public static final String CHANNEL_GATEWAY = "channelGateway";
        // JCB汎用支持的支付方式
        public static final String COMMON_ISSUE_SUPPORT_PAY_TYPE = "common_issue_support_pay_type";
        // JCB汎用支持的支付方式(GW)
        public static final String COMMON_ISSUE_SUPPORT_PAY_TYPE_FOR_GW = "common_issue_support_pay_type_for_gw";

        // JCB汎用需要HTTP认证的支付方式(GW)
        public static final String COMMON_ISSUE_SUPPORT_PAY_TYPE_FOR_HTTPCERT =
            "common_issue_support_pay_type_for_HttpCert";

        // JCB汎用需要BasicAuth的支付方式(GW)
        public static final String COMMON_ISSUE_SUPPORT_PAY_TYPE_FOR_BASICAUTH =
            "common_issue_support_pay_type_for_BasicAuth";
        // commonIssueHttpCertPath
        public static final String COMMON_ISSUE_HTTP_CERT_PATH = "commonIssueHttpCertPath";

        // JCB汎用 BasicAuth账户信息管理
        public static final String COMMON_ISSUE_BASIC_AUTH_INFO = "commonIssueBasicAuthInfo";

        // 日本支付方式
        public static final String PAYMENT_METHOD_FOR_JAPAN = "payment_method_for_japan";

        // 加盟店画面 決済機関アカウント/決済機関キー栏是否显示
        public static final String BRANCH_PARTNER_ACCT_VISIBLE = "branch_partner_acct_visible";

        // CPS参照用アクワイアラコード
        public static final String CPS_READABLE_AGENT_CODE = "cps_readable_agent_code";
        // JCB参照用アクワイアラコード
        public static final String JCB_READABLE_AGENT_CODE = "jcb_readable_agent_code";

        // uploadSaleData所需要的acq
        public static final String UPLOAD_SALE_DATA_AGENT_CODE = "upload_sale_data_agent_code";

        // YDS的sftp信息
        public static final String YDS_CENTER_SFTP_ADDRESS = "yds_center_sftp_address";
        public static final String YDS_CENTER_SFTP_USERNAME = "yds_center_sftp_username";
        public static final String YDS_CENTER_SFTP_PASSWORD = "yds_center_sftp_password";
        public static final String YDS_CENTER_SFTP_REMOTE_PATH = "yds_center_sftp_remote_path";

        // JQBCセンター的sftp信息
        public static final String JQBC_CENTER_SFTP_ADDRESS = "jqbc_center_sftp_address";
        public static final String JQBC_CENTER_SFTP_USERNAME = "jqbc_center_sftp_username";
        public static final String JQBC_CENTER_SFTP_PASSWORD = "jqbc_center_sftp_password";
        public static final String JQBC_CENTER_SFTP_REMOTE_PATH = "jqbc_center_sftp_remote_path";

        // PAYPAY FTP的登录信息
        public static final String PAYPAY_FTP_USERNAME = "paypay_ftp_username";
        public static final String PAYPAY_FTP_PASSWORD = "paypay_ftp_password";

        // PAYPAY(MPM) FTP的登录信息
        public static final String PAYPAY_MPM_FTP_HOST = "paypay_mpm_ftp_host";
        public static final String PAYPAY_MPM_FTP_PORT = "paypay_mpm_ftp_port";
        public static final String PAYPAY_MPM_FTP_USERNAME = "paypay_mpm_ftp_username";
        public static final String PAYPAY_MPM_FTP_PASSWORD = "paypay_mpm_ftp_password";
        public static final String PAYPAY_MPM_FTP_PATH = "paypay_mpm_ftp_path";

        // ONEPAY_JQBC_FOREIGNセンター的sftp信息
        public static final String JQBC_CENTER_SFTP_FOREIGN_ADDRESS = "jqbc_center_sftp_foreign_address";
        public static final String JQBC_CENTER_SFTP_FOREIGN_USERNAME = "jqbc_center_sftp_foreign_username";
        public static final String JQBC_CENTER_SFTP_FOREIGN_PASSWORD = "jqbc_center_sftp_foreign_password";
        public static final String JQBC_CENTER_SFTP_FOREIGN_REMOTE_PATH = "jqbc_center_sftp_foreign_remote_path";

        public static final String USER_CODE_DAMI_FOR_PAY = "userCodeDamiForPay";
        public static final String USER_CODE_DAMI_FOR_REFUND = "userCodeDamiForRefund";

        public static final String JCB_SUB_MANAGER_AGENT_CODE = "JCBSubManagerAgentCode";

        public static final String JCB_SUB_MANAGER_ROLE = "JCBSubManagerRole";
        public static final String JCB_SUB_MANAGER_SUB_ROLE = "JCBSubManagerSubRole";

        // 30-JCB
        public static final String JCB_ACQ_CODE = "JCBACQCode";
        // 31-JCN
        public static final String JCN_JCB_ACQ_CODE = "JCN-JCBACQCode";
        public static final String PAYTREE_SYSTEM_ACQ_CODE = "PaytreeSystemACQCode";
        // 30-JCB 和 31-JCN 合集
        public static final String JCB_AND_JCN_ACQ_CODE = "JCBAndJCNACQCode";
        // 30-JCB 和 31-JCN 的双方父亲合集
        public static final String JCB_AND_JCN_SYSTEM_ACQ_CODE = "JCBAndJCNSystemACQCode";
        public static final String PAYTREE_SYSTEM_ACQ_CODE_FOR_BRANCH_UPDATE = "PaytreeSystemACQCodeForBranchUpdate";
        public static final String DAMI_ACQS_FOR_JCB_UNIVERSAL_DATA = "damiAcqsForJcbUniversalData";
        public static final String JCN_SYSTEM_ACQ_CODE = "JCN-SystemACQCode";

        public static final String JCN_READABLE_AGENT_CODE = "jcn_readable_agent_code";

        public static final String READABLE_BRANCH_CODE = "readable_branch_code";

        public static final String JQBC_FOREIGN_READABLE_PAY_TYPE = "jqbc_foreign_readable_pay_type";
        public static final String ONEPAY_FOREIGN_READABLE_PAY_TYPE = "onepay_foreign_readable_pay_type";

        public static final String CHECK_BILL_PAY_TYPES = "checkBillPayTypes";

        public static final String CHECK_BILL_CHINA_PAY_TYPES = "checkBillChinaPayTypes";

        public static final String NOT_CLEARING_PAY_TYPES = "notClearingPayTypes";

        public static final String CLEARING_PAY_TYPE_MAP = "clearingPayType";

        public static final String QR_CODE_CHECK = "qrCodeCheck";

        public static final String PAY_TYPE_CODE = "payTypeCode";

        public static final String BILL_LIMIT = "bill_limit";
        // upload_trade_file_agent_code

        // JCB汎用支持的代理商
        public static final String COMMON_ISSUE_SUPPORT_AGENT_CODE = "common_issue_support_agent_code";

        public static final String JCB_SMART_CODE_AGENT = "JCB-smart_code-agent";

        public static final String SMART_CODE_PAYTYPE_TYPE = "smart_code_payType";

        // excel 文件上传 格式check 包括大小、后缀名
        public static final String FILE_UPLOAD_LIMT = "fileUploadLimt";
        // 页面刷新的时间设置
        public static final String REFRESH_TIME_JSP = "refreshJSPTime";

        public static final String GN_PAYTYPE = "gnPayType";
        public static final String SAVE_BILL_MONITOR_PAYTYPE = "saveBillMonitorPayType";
        public static final String ALERT_AUTOMATICALLY_CONDITION = "alertAutomaticallyCondition";
        public static final String ALERT_DETECT_PAYTYPE = "alertDetectPayType";
        // 泛用支付方式 下载对账单用 SFTP管理
        public static final String SFTP_FOR_COMMON_ISSUE_SAVE_BILL = "sftpForCommonIssueSaveBill";

        public static final String YAHOO_TO_PAYPAY_EFFECT_END_DATE = "yahooToPaypayEffectEndDate";

        public static final String YAHOO_TO_PAYPAY_EFFECT_END_TIME = "yahooToPaypayEffectEndTime";

        public static final String YAHOO_TO_PAYPAY_EFFECT_START_DATE_NEW = "yahooToPaypayEffectStartDateNew";

        public static final String YAHOO_TO_PAYPAY_EFFECT_START_TIME_NEW = "yahooToPaypayEffectStartTimeNew";

        public static final String YAHOO_TO_PAYPAY_EFFECT_END_DATE_NEW = "yahooToPaypayEffectEndDateNew";

        public static final String YAHOO_TO_PAYPAY_EFFECT_END_TIME_NEW = "yahooToPaypayEffectEndTimeNew";
        // batch对账忽略取消和返金的差异
        public static final String PAY_TYPE_GROUP_IGNORE_REFUND_AND_CANCEL = "payTypeGroupIgnoreRefundAndCancel";

        public static final String UNION_PAY_BARCODE = "unionPayBarcode";

        public static final String ALIPAY_CONNECT_EFFECT_MAP = "alipayConnectEffectMap";
        // 控制台各种一览Excel下载常量
        public static final String SHOPMANAGE_EXCEL_SHEET_MAX_ROW = "shopManagerExcelSheetMaxRow";
        public static final String SHOPMANAGE_EXCEL_SEARCH_PAGE_LIMIT = "shopManagerExcelSearchPageLimit";
        public static final String SHOPMANAGE_EXCEL_DOWNLOAD_MAX = "shopManagerExcelDownloadMax";
        public static final String QUERY_MAX_COUNT = "queryMaxCount";
        // onepay系支付方式
        public static final String ONEPAY_PAYTYPE = "onepay_payType";
        // JCN固有支付方式
        public static final String PAYTYPE_FOR_JCN_MAP = "payTypeForJcnMap";
        // notifyInfo备份间隔
        public static final String NOTIFY_INFO_BACKUP_DAYS = "notify_info_backup_days";

        // notify备份间隔
        public static final String NOTIFY_BACKUP_DAYS = "notify_backup_days";

        public static final String NOTIFY_COMMIT_LIMIT = "notify_commit_limit";

        public static final String NOTIFY_SUB_COMMIT_LIMIT = "notify_sub_commit_limit";

        // mpm取引明细取入
        public static final String MPM_SAVE_TRADE_DATA_PAYTYPE = "mpm_save_trade_data_paytype";
        // mpm取引明细取入的sftp信息
        public static final String MARKETING_MPM_SFTP_ADDRESS = "marketing_mpm_sftp_address";
        public static final String MARKETING_MPM_SFTP_USERNAME = "marketing_mpm_sftp_username";
        public static final String MARKETING_MPM_SFTP_PASSWORD = "marketing_mpm_sftp_password";
        public static final String MARKETING_MPM_SFTP_REMOTE_PATH = "marketing_mpm_sftp_remote_path";
    }

    public static class CodeMasterKeyCode {
        // CPS参照用アクワイアラコード
        public static final String CPS_READABLE_AGENT_CODE = "cps_readable_agent_code";
        // JCB参照用アクワイアラコード
        public static final String JCB_READABLE_AGENT_CODE = "jcb_readable_agent_code";

        public static final String SMART_CODE_AGENT = "smart_code_agent";

        public static final String HEAD_CODE = "head_code";

        public static final String HEAD_CODE_FOR_BANKPAY = "head_code_for_bankpay";

        public static final String PAYLOAD_VALUE = "payload_value";

        public static final String PAYLOAD_VALUE_FOR_BANKPAY = "payload_value_for_bankpay";

        public static final String APP_CODE = "app_code";

        public static final String AFD_CODE = "afd_code";

        public static final String JCB_AGENT_CODE = "JCBACQCode";

        public static final String JCN_JCB_AGENT_CODE = "JCN-JCBACQCode";
        public static final String REFRESH_JSP_TIME = "refresh_jsp_time";

        public static final String SMART_CODE_PAYTYPE_CODE = "smart_code_payType";

        public static final String GN_PAYTYPE = "gn_pay_type";

        public static final String UNION_PAY_BARCODE = "unionPayBarcode";
        public static final String QUERY_MAX_COUNT_BRANCH_AUTO_IMPORT_BATCH_STATUS =
            "queryMaxCount_branchAutoImportBatchStatus";
    }

    public static class ButtonFlag {
        public static final String ADD = "add";
        public static final String UPDATE = "update";
    }

    /**
     * JCB汎用スキームデータ保存为CSV的文件名
     */
    public static class JcbUniversalDataCsvFileName {
        /**
         * JCB汎用スキーム精算データ(yyyymmdd_yyyymmdd).csv
         */
        public static final String TRADE_CSV = "JCB汎用スキーム精算データ({0}_{1}).csv";
        /**
         * JCB汎用スキーム精算データ(yyyymmdd_yyyymmdd).zip
         */
        public static final String TRADE_ZIP = "JCB汎用スキーム精算データ({0}_{1}).zip";
        /**
         * JCB汎用スキーム加盟店データ(yyyymmdd_yyyymmdd).csv
         */
        public static final String MERCHANT_CSV = "JCB汎用スキーム加盟店データ({0}_{1}).csv";
        /**
         * JCB汎用スキーム加盟店データ(yyyymmdd_yyyymmdd).zip
         */
        public static final String MERCHANT_ZIP = "JCB汎用スキーム加盟店データ({0}_{1}).zip";
    }

    /**
     * JCB汎用スキームデータタイプ
     *
     */
    public static class JcbUniversalDataType {

        /**
         * JCB汎用スキーム精算データ
         */
        public static final String TRADE = "01";

        /**
         * JCB汎用スキーム加盟店データ
         */
        public static final String MERCHANT = "02";
    }

    /**
     * JCB汎用スキームデータレベル
     *
     */
    public static class JcbUniversalDataLevel {

        /**
         * JCB汎用スキーム加盟店データ
         */
        public static final String JCB = "1";

        /**
         * CPS汎用スキーム精算データ
         */
        public static final String CPS = "2";

    }

    /**
     * JCB汎用スキームデータ作成ステータス
     *
     */
    public static class JcbUniversalDataCreateStatus {
        /**
         * 作成中
         */
        public static final String PROCESSING = "00";
        /**
         * 作成成功.
         */
        public static final String SUCCESS = "01";
        /**
         * 作成失敗.
         */
        public static final String FAIL = "02";
    }

    /**
     * JCB汎用スキームデータ作成ステータス表示文字
     *
     * @return
     */
    public static Map<String, String> getJcbUniversalDataCreateStatus() {
        final Map<String, String> map = new HashMap<>();
        map.put("00", "作成中");
        map.put("01", "作成成功");
        map.put("02", "作成失敗");
        return map;
    }

    /**
     * JCB汎用スキーム精算結果表示文字
     *
     * @return
     */
    public static Map<String, String> getJcbUniversalTradeDataCreateResult() {
        final Map<String, String> map = new HashMap<>();
        map.put("00", "JCB汎用スキーム精算データの生成が作成しています");
        map.put("01", "JCB汎用スキーム精算データの生成が成功しました");
        map.put("02", "JCB汎用スキーム精算データの生成が作成失敗しました");
        return map;
    }

    /**
     * JCB汎用スキーム加盟店結果表示文字
     *
     * @return
     */
    public static Map<String, String> getJcbUniversalMerchantDataCreateResult() {
        final Map<String, String> map = new HashMap<>();
        map.put("00", "JCB汎用スキーム加盟店データの生成が作成しています");
        map.put("01", "JCB汎用スキーム加盟店データの生成が成功しました");
        map.put("02", "JCB汎用スキーム加盟店データの生成が作成失敗しました");
        return map;
    }

    /**
     * JCB汎用スキームデータ 取引ステータス表示文字
     *
     * @return
     */
    public static Map<String, String> getJcbUniversalDataTransStatus() {
        final Map<String, String> map = new HashMap<>();
        map.put("00", "正常(成立)");
        map.put("01", "エラー(不成立)");
        map.put("06", "正常(成立)");
        map.put("07", "エラー(不成立)");
        return map;
    }

    /**
     * JCB汎用スキームデータ 取引種別表示文字
     *
     * @return
     */
    /*
     * public static Map<String, String> getJcbUniversalDataTransType() { final
     * Map<String, String> map = new HashMap<>(); map.put("01", "支払い");
     * map.put("02", "取消"); return map; }
     */
    public static class QuoPayResponseSuccess {
        public static final String SYORI_STS = "000";
        public static final String SYOSAI_CD = "0000";
    }

    public static class GmoTransType {
        public static final String PAY_PAID = "paid";
        public static final String PAY_CANCELED = "canceled";
        public static final String REVERSE = "canceling";
    }

    /**
     * kddi店铺情报excel密码 信息
     */
    public static class KDDIShopExcelPassword {
        public static final String KEYTYPE = "KDDIShopInfoExcelPassword";
        public static final String KEYCODE = "KDDIExcelPsd";
    }

    public static class JCBShopExcelPassword {
        public static final String KEYTYPE = "JCBShopInfoExcelPassword";
        public static final String KEYCODE = "JCBExcelPsd";
    }

    public static class BankPayTerminalIdExcelPassword {
        public static final String KEYTYPE = "BankPayTerminalIdExcelPassword";
        public static final String KEYCODE = "BankPayExcelPsd";
    }

    public static class SchemeType {
        // 0:独自.
        public static final String OWN = "0";
        // 1:汎用.
        public static final String GENERAL = "1";
    }

    public static class GatewayType {
        // 0:独自.
        public static final String ISSUE = "issue";
        // 1:汎用.
        public static final String COMMON = "common";
    }

    // 页面自动刷新的时间（单位ms）
    public static final int REFRESH_JSP_TIME = 20000;

    public static class FileUploadLimit {
        public static final String fileMaxSize = "10M";
        public static final String suffixName = ".xlsx";
    }

    public static class ShopFileUploadBranchSupportType {
        public static final String JCB = "JCB";
        public static final String KDDI = "KDDI";
        public static final String BANKPAY = "BankPay";
        public static final String RULES_BATCH_UPLOAD = "RulesBatchUpload";
    }

    public static class ApplyManageStatus {
        public static final String DOWNLOAD_IN = "01";
        public static final String DOWNLOAD_SUCCESS = "02";
        public static final String DOWNLOAD_FAIL = "03";
        public static final String IMPORT_IN = "04";
        public static final String IMPORT_SUCCESS = "05";
        public static final String IMPORT_FAIL = "06";
        public static final String DELETE_WAIT = "07";
        public static final String DELETE_SUCCESS = "08";
        public static final String DELETE_OVER = "09";
        public static final String FILE_ERROR = "99";
    }

    public static class PKStatus {
        public static final String NO_PK = "00";
        public static final String GENERATE_IN = "01";
        public static final String GENERATE_SUCCESS = "02";
        public static final String GENERATE_FAIL = "03";
        public static final String UPLOAD_IN = "04";
        public static final String UPLOAD_SUCCESS = "05";
        public static final String UPLOAD_FAIL = "06";
    }

    public static class MidStatus {
        public static final String NO_MID = "00";
        public static final String GENERATE_IN = "01";
        public static final String GENERATE_SUCCESS = "02";
        public static final String GENERATE_FAIL = "03";
        public static final String UPLOAD_IN = "04";
        public static final String UPLOAD_SUCCESS = "05";
        public static final String UPLOAD_FAIL = "06";
    }

    public static Map<String, String> getApplyManageStatus() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "ダウンロード中");
        map.put("02", "ダウンロード済み");
        map.put("03", "ダウンロード失敗");
        map.put("04", "インポート中");
        map.put("05", "インポート済み");
        map.put("06", "インポート失敗");
        map.put("07", "取込未了");
        map.put("08", "取込完了");
        map.put("09", "取込中止");
        map.put("99", "ファイル不正");
        return map;
    }

    public static Map<String, String> getPkStatus() {
        final Map<String, String> map = new HashMap<>();
        map.put("00", "PK情報無");
        map.put("01", "PK生成中");
        map.put("02", "PK生成成功");
        map.put("03", "PK生成失敗");
        map.put("04", "PKアップロード中");
        map.put("05", "PKアップロード成功");
        map.put("06", "PKアップロード失敗");
        return map;
    }

    public static Map<String, String> getMidStatus() {
        final Map<String, String> map = new HashMap<>();
        map.put("00", "MID情報無");
        map.put("01", "MID生成中");
        map.put("02", "MID生成成功");
        map.put("03", "MID生成失敗");
        map.put("04", "MIDアップロード中");
        map.put("05", "MIDアップロード成功");
        map.put("06", "MIDアップロード失敗");
        return map;
    }

    /**
     * applyMange中异常系状态
     *
     * @return List
     */
    public static List<String> getApplyManageExceptionStatusList() {
        final List<String> list = new ArrayList<>();
        list.add("01"); // ダウンロード中
        list.add("03"); // ダウンロード失敗
        list.add("04"); // インポート中
        list.add("06"); // インポート失敗
        list.add("99"); // ファイル不正
        return list;
    }

    public static class OrigamiCheckBillActionType {
        public static final String PAY = "Create";
        public static final String REFUND = "Refund";
    }

    public static class AlertErrorCodeLevel {
        public static final String ERROR_CODE_LEVEL = "00";
        public static final String SUB_ERROR_CODE_LEVEL = "01";
        public static final String ERROR_DETAIL_LEVEL = "02";
    }

    public static class BranchAutoParameterValidation {
        public static final int LENGTH_NAME = 64;
        public static final int LENGTH_HOST = 128;
        public static final int LENGTH_PORT = 5;
        public static final int LENGTH_LOGIN_USER = 32;
        public static final int LENGTH_LOGIN_PASSWORD = 32;
        public static final int LENGTH_ROOT_PATH = 512;
        public static final int LENGTH_ACQ_PATTERN = 32;
        public static final int LENGTH_ISSUER_CODE = 32;

        public static final int IGNORE_LENGTH = 0;
    }

    // アクワイアラ付替えステータス
    public static class AgentAlterStatus {
        // 00：削除済み
        public static final String DELETED = "00";
        // 01：付替え待ち
        public static final String ALTERING = "01";
        // 02：新支払チャネル登録済み
        public static final String REGISTER_COMPLETE = "02";
        // 03：新支払チャネル登録失敗
        public static final String REGISTER_FAIL = "03";
        // 04：一回目付替え済み
        public static final String FIRST_ALTER_COMPLETE = "04";
        // 05：一回目付替え失敗
        public static final String FIRST_ALTER_FAIL = "05";
        // 06：二回目付替え済み
        public static final String SECOND_ALTER_COMPLETE = "06";
        // 07：二回目付替え失敗
        public static final String SECOND_ALTER_FAIL = "07";
        // 08：付替え済み
        public static final String ALTER_COMPLETE = "08";
        // 09：付替え失敗
        public static final String ALTER_FAIL = "09";
    }

    /**
     * アクワイアラ付替えステータス
     *
     */
    public static Map<String, String> getAgentAlterStatusMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("00", "削除済み");
        map.put("01", "付替え待ち");
        map.put("02", "新支払チャネル登録済み");
        map.put("03", "新支払チャネル登録失敗");
        map.put("04", "一回目付替え済み");
        map.put("05", "一回目付替え失敗");
        map.put("06", "二回目付替え済み");
        map.put("07", "二回目付替え失敗");
        map.put("08", "付替え済み");
        map.put("09", "付替え失敗");
        return map;
    }

    public static class AgentAlterOperateType {
        // 00：削除済み
        public static final String ORIGINAL = "00";
        // 01：付替え待ち
        public static final String ALTERED = "01";
    }

    public static Map<String, String> getFileStatusMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("00", "更新完了");
        map.put("01", "更新失敗");
        map.put("02", "更新中");
        map.put("03", "チェック失敗");
        return map;
    }

    public static class fileStatus {
        public static final String SUCCESS = "00";
        public static final String FAILED = "01";
        public static final String UPDATING = "02";
        public static final String CHECK_FAILED = "03";
    }

    public static Map<String, String> getSysTradeFileTypeMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("01", "取引明細ファイル");
        map.put("02", "実績データ");
        return map;
    }

    public static class sysTradeFileType {
        public static final String TRANS_FILE = "01";
        public static final String TRADE_DATE = "02";
    }

    public static class rulesBatchUploadBatchType {
        public static final String INSERT = "新規";
        public static final String UPDATE = "更新";
        public static final String IGNORE = "対象外";
    }

    public static String[] getRulesBatchUploadBatchTypeArray() {
        final String[] array = new String[3];
        array[0] = "新規";
        array[1] = "更新";
        array[2] = "対象外";
        return array;
    }

    public static String[] getRulesBatchUploadRuleTypeArray() {
        final String[] array = new String[3];
        array[0] = "未発効";
        array[1] = "発効中";
        array[2] = "　";
        return array;
    }

    /**
     * ログ調査種別Map
     *
     * @return accessHistoryログ調査種別Map
     */
    public static Map<String, String> getAccessHistorylogSearchTypeMap() {
        final Map<String, String> map = new HashMap<>();

        map.put("0", "POS⇒PayTree");
        map.put("1", "PayTree⇒イシュア");
        map.put("2", "イシュア⇒PayTree");
        map.put("3", "PayTree⇒POS");
        return map;
    }

    public static final String PAY_TYPE_ALL = "all";

    public static Map<String, String> getMonitorApiType() {
        final Map<String, String> map = new HashMap<>();
        map.put("pay", "01");
        map.put("refund", "02");
        map.put("reverse", "03");
        map.put("deposit", "04");
        map.put("confirm", "05");
        map.put("tqcPay", "06");
        map.put("tqcRefund", "07");
        map.put("tqcReverse", "08");
        map.put("tqcConfirm", "09");
        return map;
    }

    /**
     * 生成流水号，位数为24的支付方式 新增支付方式，并且流水号的位数为24为，需要在这里追加
     *
     * @return
     */
    public static Map<String, String> getOrderDetailIdfor24() {
        Map<String, String> OrderDetailIdfor24Map = new HashMap<>(16);

        OrderDetailIdfor24Map.put("04", "04");
        OrderDetailIdfor24Map.put("13", "13");
        OrderDetailIdfor24Map.put("14", "14");
        OrderDetailIdfor24Map.put("O01", "O01");
        OrderDetailIdfor24Map.put("O02", "O02");
        OrderDetailIdfor24Map.put("O03", "O03");
        OrderDetailIdfor24Map.put("GN01", "GN01");
        OrderDetailIdfor24Map.put("GN02", "GN02");
        OrderDetailIdfor24Map.put("GN03", "GN03");
        OrderDetailIdfor24Map.put("M01", "M01");
        OrderDetailIdfor24Map.put("M02", "M02");
        OrderDetailIdfor24Map.put("M99", "M99");
        OrderDetailIdfor24Map.put("G01", "G01");
        OrderDetailIdfor24Map.put("G02", "G02");
        OrderDetailIdfor24Map.put("GN90", "GN90");
        OrderDetailIdfor24Map.put("G90", "G90");
        OrderDetailIdfor24Map.put("O25", "O25");
        OrderDetailIdfor24Map.put("M04", "M04");
        return OrderDetailIdfor24Map;
    }

    public static Map<String, String> getJobNames() {
        Map<String, String> jobNames = new HashMap<>(16);
        jobNames.put("01", "加盟店登録");
        jobNames.put("02", "支払チャンネル登録");
        jobNames.put("03", "店舗ISS固有キー登録");
        return jobNames;
    }

    public static Map<String, String> branchAutoImportBatchStatus() {
        Map<String, String> jobNames = new HashMap<>(16);
        jobNames.put("0", "正常");
        jobNames.put("1", "異常");
        return jobNames;
    }

    /**
     * 非同期通知 issue的支付方式
     */
    public static class TqcNotifyPayType {
        /**
         * line
         */
        public static final String LINE = "line";
        /**
         * paypay
         */
        public static final String PAYPAY = "paypay";
    }

    /**
     * 非同期通知 issue的支付方式
     */
    public static class TqcNotifyStatus {
        /**
         * 00:初始;01:接受issue请求;02:发送过通知
         */
        public static final String START = "00";
        public static final String RECEIVE = "01";
        public static final String SEND = "02";
    }

    public enum Notify {
        INACTIVE("00"), ACTIVE("01"), SEND_CODE("SYS管理者");

        private final String value;

        Notify(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

}
