package twilio.flutter.twilio_programmable_video

import com.twilio.video.RemoteAudioTrack
import com.twilio.video.RemoteAudioTrackPublication
import com.twilio.video.RemoteDataTrack
import com.twilio.video.RemoteDataTrackPublication
import com.twilio.video.RemoteParticipant
import com.twilio.video.RemoteVideoTrack
import com.twilio.video.RemoteVideoTrackPublication
import com.twilio.video.TwilioException

class RemoteParticipantListener : BaseListener(), RemoteParticipant.Listener {
    override fun onAudioTrackDisabled(remoteParticipant: RemoteParticipant, remoteAudioTrackPublication: RemoteAudioTrackPublication) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onAudioTrackDisabled => " +
                "trackSid: ${remoteAudioTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteAudioTrackPublication.isTrackEnabled}")

        sendEvent("audioTrackDisabled", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteAudioTrackPublication" to remoteAudioTrackPublicationToMap(remoteAudioTrackPublication)
        ))
    }

    override fun onAudioTrackEnabled(remoteParticipant: RemoteParticipant, remoteAudioTrackPublication: RemoteAudioTrackPublication) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onAudioTrackEnabled => " +
                "trackSid: ${remoteAudioTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteAudioTrackPublication.isTrackEnabled}")

        sendEvent("audioTrackEnabled", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteAudioTrackPublication" to remoteAudioTrackPublicationToMap(remoteAudioTrackPublication)
        ))
    }

    override fun onAudioTrackPublished(remoteParticipant: RemoteParticipant, remoteAudioTrackPublication: RemoteAudioTrackPublication) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onAudioTrackPublished => " +
                "trackSid: ${remoteAudioTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteAudioTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteAudioTrackPublication.isTrackSubscribed}")

        sendEvent("audioTrackPublished", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteAudioTrackPublication" to remoteAudioTrackPublicationToMap(remoteAudioTrackPublication)
        ))
    }

    override fun onAudioTrackSubscribed(remoteParticipant: RemoteParticipant, remoteAudioTrackPublication: RemoteAudioTrackPublication, remoteAudioTrack: RemoteAudioTrack) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onAudioTrackSubscribed => " +
                "trackSid: ${remoteAudioTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteAudioTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteAudioTrackPublication.isTrackSubscribed}")

        sendEvent("audioTrackSubscribed", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteAudioTrackPublication" to remoteAudioTrackPublicationToMap(remoteAudioTrackPublication)
        ))
    }

    override fun onAudioTrackSubscriptionFailed(remoteParticipant: RemoteParticipant, remoteAudioTrackPublication: RemoteAudioTrackPublication, twilioException: TwilioException) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onAudioTrackSubscriptionFailed => " +
                "trackSid: ${remoteAudioTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteAudioTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteAudioTrackPublication.isTrackSubscribed}")

        sendEvent("audioTrackSubscriptionFailed", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteAudioTrackPublication" to remoteAudioTrackPublicationToMap(remoteAudioTrackPublication)
        ), twilioException)
    }

    override fun onAudioTrackUnpublished(remoteParticipant: RemoteParticipant, remoteAudioTrackPublication: RemoteAudioTrackPublication) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onAudioTrackUnpublished => " +
                "trackSid: ${remoteAudioTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteAudioTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteAudioTrackPublication.isTrackSubscribed}")

        sendEvent("audioTrackUnpublished", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteAudioTrackPublication" to remoteAudioTrackPublicationToMap(remoteAudioTrackPublication)
        ))
    }

    override fun onAudioTrackUnsubscribed(remoteParticipant: RemoteParticipant, remoteAudioTrackPublication: RemoteAudioTrackPublication, remoteAudioTrack: RemoteAudioTrack) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onAudioTrackUnsubscribed => " +
                "trackSid: ${remoteAudioTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteAudioTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteAudioTrackPublication.isTrackSubscribed}")

        sendEvent("audioTrackUnsubscribed", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteAudioTrackPublication" to remoteAudioTrackPublicationToMap(remoteAudioTrackPublication),
                "remoteAudioTrack" to remoteAudioTrackToMap(remoteAudioTrack)
        ))
    }

    override fun onDataTrackPublished(remoteParticipant: RemoteParticipant, remoteDataTrackPublication: RemoteDataTrackPublication) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onDataTrackPublished => " +
                "trackSid: ${remoteDataTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteDataTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteDataTrackPublication.isTrackSubscribed}")

        sendEvent("dataTrackPublished", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteDataTrackPublication" to remoteDataTrackPublicationToMap(remoteDataTrackPublication)
        ))
    }

    override fun onDataTrackSubscribed(remoteParticipant: RemoteParticipant, remoteDataTrackPublication: RemoteDataTrackPublication, remoteDataTrack: RemoteDataTrack) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onDataTrackSubscribed => " +
                "trackSid: ${remoteDataTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteDataTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteDataTrackPublication.isTrackSubscribed}")

        sendEvent("dataTrackSubscribed", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteDataTrackPublication" to remoteDataTrackPublicationToMap(remoteDataTrackPublication)
        ))
        remoteDataTrackPublication.remoteDataTrack?.setListener(TwilioProgrammableVideoPlugin.remoteDataTrackListener)
    }

    override fun onDataTrackSubscriptionFailed(remoteParticipant: RemoteParticipant, remoteDataTrackPublication: RemoteDataTrackPublication, twilioException: TwilioException) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onDataTrackSubscriptionFailed => " +
                "trackSid: ${remoteDataTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteDataTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteDataTrackPublication.isTrackSubscribed}")

        sendEvent("dataTrackSubscriptionFailed", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteDataTrackPublication" to remoteDataTrackPublicationToMap(remoteDataTrackPublication)
        ), twilioException)
    }

    override fun onDataTrackUnpublished(remoteParticipant: RemoteParticipant, remoteDataTrackPublication: RemoteDataTrackPublication) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onDataTrackUnpublished => " +
                "trackSid: ${remoteDataTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteDataTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteDataTrackPublication.isTrackSubscribed}")

        sendEvent("dataTrackUnpublished", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteDataTrackPublication" to remoteDataTrackPublicationToMap(remoteDataTrackPublication)
        ))
    }

    override fun onDataTrackUnsubscribed(remoteParticipant: RemoteParticipant, remoteDataTrackPublication: RemoteDataTrackPublication, remoteDataTrack: RemoteDataTrack) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onDataTrackUnsubscribed => " +
                "trackSid: ${remoteDataTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteDataTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteDataTrackPublication.isTrackSubscribed}")

        sendEvent("dataTrackUnsubscribed", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteDataTrackPublication" to remoteDataTrackPublicationToMap(remoteDataTrackPublication),
                "remoteDataTrack" to RemoteDataTrackListener.remoteDataTrackToMap(remoteDataTrack)
        ))
    }

    override fun onVideoTrackDisabled(remoteParticipant: RemoteParticipant, remoteVideoTrackPublication: RemoteVideoTrackPublication) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onVideoTrackDisabled => " +
                "trackSid: ${remoteVideoTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteVideoTrackPublication.isTrackEnabled}")

        sendEvent("videoTrackDisabled", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteVideoTrackPublication" to remoteVideoTrackPublicationToMap(remoteVideoTrackPublication)
        ))
    }

    override fun onVideoTrackEnabled(remoteParticipant: RemoteParticipant, remoteVideoTrackPublication: RemoteVideoTrackPublication) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onVideoTrackEnabled => " +
                "trackSid: ${remoteVideoTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteVideoTrackPublication.isTrackEnabled}")

        sendEvent("videoTrackEnabled", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteVideoTrackPublication" to remoteVideoTrackPublicationToMap(remoteVideoTrackPublication)
        ))
    }

    override fun onVideoTrackPublished(remoteParticipant: RemoteParticipant, remoteVideoTrackPublication: RemoteVideoTrackPublication) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onVideoTrackPublished => " +
                "trackSid: ${remoteVideoTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteVideoTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteVideoTrackPublication.isTrackSubscribed}")

        sendEvent("videoTrackPublished", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteVideoTrackPublication" to remoteVideoTrackPublicationToMap(remoteVideoTrackPublication)
        ))
    }

    override fun onVideoTrackSubscribed(remoteParticipant: RemoteParticipant, remoteVideoTrackPublication: RemoteVideoTrackPublication, remoteVideoTrack: RemoteVideoTrack) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onVideoTrackSubscribed => " +
                "trackSid: ${remoteVideoTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteVideoTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteVideoTrackPublication.isTrackSubscribed}")

        sendEvent("videoTrackSubscribed", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteVideoTrackPublication" to remoteVideoTrackPublicationToMap(remoteVideoTrackPublication)
        ))
    }

    override fun onVideoTrackSubscriptionFailed(remoteParticipant: RemoteParticipant, remoteVideoTrackPublication: RemoteVideoTrackPublication, twilioException: TwilioException) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onVideoTrackSubscriptionFailed => " +
                "trackSid: ${remoteVideoTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteVideoTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteVideoTrackPublication.isTrackSubscribed}")

        sendEvent("videoTrackSubscriptionFailed", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteVideoTrackPublication" to remoteVideoTrackPublicationToMap(remoteVideoTrackPublication)
        ), twilioException)
    }

    override fun onVideoTrackUnpublished(remoteParticipant: RemoteParticipant, remoteVideoTrackPublication: RemoteVideoTrackPublication) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onVideoTrackUnpublished => " +
                "trackSid: ${remoteVideoTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteVideoTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteVideoTrackPublication.isTrackSubscribed}")

        sendEvent("videoTrackUnpublished", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteVideoTrackPublication" to remoteVideoTrackPublicationToMap(remoteVideoTrackPublication)
        ))
    }

    override fun onVideoTrackUnsubscribed(remoteParticipant: RemoteParticipant, remoteVideoTrackPublication: RemoteVideoTrackPublication, remoteVideoTrack: RemoteVideoTrack) {
        TwilioProgrammableVideoPlugin.debug("RemoteParticipantListener.onVideoTrackUnsubscribed => " +
                "trackSid: ${remoteVideoTrackPublication.trackSid}, " +
                "isTrackEnabled: ${remoteVideoTrackPublication.isTrackEnabled}, " +
                "isTrackSubscribed: ${remoteVideoTrackPublication.isTrackSubscribed}")

        sendEvent("videoTrackUnsubscribed", mapOf(
                "remoteParticipant" to remoteParticipantToMap(remoteParticipant, true),
                "remoteVideoTrackPublication" to remoteVideoTrackPublicationToMap(remoteVideoTrackPublication),
                "remoteVideoTrack" to remoteVideoTrackToMap(remoteVideoTrack)
        ))
    }

    companion object {
        @JvmStatic
        fun remoteParticipantToMap(remoteParticipant: RemoteParticipant, noTracks: Boolean = false): Map<String, Any?> {
            val remoteAudioTrackPublications = if (!noTracks) remoteParticipant.remoteAudioTracks.map { remoteAudioTrackPublicationToMap(it) } else null
            val remoteVideoTrackPublications = if (!noTracks) remoteParticipant.remoteVideoTracks.map { remoteVideoTrackPublicationToMap(it) } else null

            return mapOf(
                    "identity" to remoteParticipant.identity,
                    "sid" to remoteParticipant.sid,
                    "remoteAudioTrackPublications" to remoteAudioTrackPublications,
                    "remoteVideoTrackPublications" to remoteVideoTrackPublications
            )
        }

        @JvmStatic
        fun remoteAudioTrackPublicationToMap(remoteAudioTrackPublication: RemoteAudioTrackPublication): Map<String, Any?> {
            return mapOf(
                    "sid" to remoteAudioTrackPublication.trackSid,
                    "name" to remoteAudioTrackPublication.trackName,
                    "enabled" to remoteAudioTrackPublication.isTrackEnabled,
                    "subscribed" to remoteAudioTrackPublication.isTrackSubscribed,
                    "remoteAudioTrack" to remoteAudioTrackToMap(remoteAudioTrackPublication.remoteAudioTrack)
            )
        }

        @JvmStatic
        fun remoteAudioTrackToMap(remoteAudioTrack: RemoteAudioTrack?): Map<String, Any>? {
            if (remoteAudioTrack != null) {
                return mapOf(
                        "sid" to remoteAudioTrack.sid,
                        "name" to remoteAudioTrack.name,
                        "enabled" to remoteAudioTrack.isEnabled
                )
            }
            return null
        }

        @JvmStatic
        fun remoteDataTrackPublicationToMap(remoteDataTrackPublication: RemoteDataTrackPublication): Map<String, Any?> {
            return mapOf(
                    "sid" to remoteDataTrackPublication.trackSid,
                    "name" to remoteDataTrackPublication.trackName,
                    "enabled" to remoteDataTrackPublication.isTrackEnabled,
                    "subscribed" to remoteDataTrackPublication.isTrackSubscribed,
                    "remoteDataTrack" to RemoteDataTrackListener.remoteDataTrackToMap(remoteDataTrackPublication.remoteDataTrack)
            )
        }

        @JvmStatic
        fun remoteVideoTrackPublicationToMap(remoteVideoTrackPublication: RemoteVideoTrackPublication): Map<String, Any?> {
            return mapOf(
                    "sid" to remoteVideoTrackPublication.trackSid,
                    "name" to remoteVideoTrackPublication.trackName,
                    "enabled" to remoteVideoTrackPublication.isTrackEnabled,
                    "subscribed" to remoteVideoTrackPublication.isTrackSubscribed,
                    "remoteVideoTrack" to remoteVideoTrackToMap(remoteVideoTrackPublication.remoteVideoTrack)
            )
        }

        @JvmStatic
        fun remoteVideoTrackToMap(remoteVideoTrack: RemoteVideoTrack?): Map<String, Any>? {
            if (remoteVideoTrack != null) {
                return mapOf(
                        "sid" to remoteVideoTrack.sid,
                        "name" to remoteVideoTrack.name,
                        "enabled" to remoteVideoTrack.isEnabled
                )
            }
            return null
        }
    }
}
