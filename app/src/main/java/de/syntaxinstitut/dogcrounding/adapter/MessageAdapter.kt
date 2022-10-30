package de.syntaxinstitut.dogcrounding.adapter

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.syntaxinstitut.dogcrounding.R
import de.syntaxinstitut.dogcrounding.data.Message
import de.syntaxinstitut.dogcrounding.utils.Constants.RECEIVE_ID
import de.syntaxinstitut.dogcrounding.utils.Constants.SEND_ID

class MessageAdapter(private val context: Context): RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    var messagesList = mutableListOf<Message>()

    inner class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnLongClickListener {
                AlertDialog.Builder(context)
                    .setTitle("Delete Message")
                    .setMessage("Are you sure you want to delete this message")
                    .setPositiveButton("Yes") { d, i ->
                        messagesList.removeAt(adapterPosition)
                        notifyItemRemoved(adapterPosition)
                        d.dismiss()
                    }.setNegativeButton("No") { d, i ->
                        d.dismiss()
                    }.create().show()
                true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.message_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val currentMessage = messagesList[position]

        val myMsg = holder.itemView.findViewById<TextView>(R.id.message)
        val botMsg = holder.itemView.findViewById<TextView>(R.id.message)

        when (currentMessage.id) {
            SEND_ID -> {
                myMsg.apply {
                    text = currentMessage.message
                    visibility = View.VISIBLE
                }
                botMsg.visibility = View.GONE
            }
            RECEIVE_ID -> {
                botMsg.apply {
                    text = currentMessage.message
                    visibility = View.VISIBLE
                }
                myMsg.visibility = View.GONE
            }


        }
    }

    override fun getItemCount(): Int {
        return messagesList.size
    }

    fun insertMessage(message: Message) {
        this.messagesList.add(message)
        notifyItemInserted(messagesList.size)
    }
}