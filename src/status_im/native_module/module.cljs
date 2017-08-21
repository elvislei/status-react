(ns status-im.native-module.module)

(defprotocol IReactNativeStatus
  (-init-jail [this])
  (-move-to-internal-storage [this callback])
  (-start-node [this config])
  (-stop-node [this])
  (-stop-rpc-server [this])
  (-start-rpc-server [this])
  (-restart-rpc [this])
  (-create-account [this password callback])
  (-recover-account [this passphrase password callback])
  (-login [this address password callback])
  (-complete-transactions [this hashes password callback])
  (-discard-transaction [this id])
  (-parse-jail [this chat-id file callback])
  (-call-jail [this params])
  (-call-function! [this params])
  (-set-soft-input-mode [this mode])
  (-clear-web-data [this])
  (-call-web3 [this host payload callback])
  (-module-initialized! [this])
  (-should-move-to-internal-storage? [this callback])
  (-notify [this token callback]))
