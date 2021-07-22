package kossette;

import kossette.Tape;

public interface RecorderListener {
  void onRecorderStart(Tape tape);
  void onRecorderStop();
}
