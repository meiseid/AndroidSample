// ダイアログイベントリスナー
package jp.co.meiseid.PullDownButton;

import java.util.EventListener;

public interface cDialogListener extends EventListener {
    void onDialogYesClick(cDialog dialog);

    void onDialogCloseClick(cDialog dialog);

    void onDialogChoice(cDialog dialog, int index, String text);

} //end of class
