package com.example.afrahyanbaa

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.afrahyanbaa.databinding.ListInvitationItemBinding


class InvitationAdaptar (private  val invtitation : List<InvitationDataModel>) :
    RecyclerView.Adapter<InvitationAdaptar.MyViewHolder>(){
    class MyViewHolder (val binding : ListInvitationItemBinding) : RecyclerView.ViewHolder(binding.root)
    var context: Context? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        this.context = parent.context
        val binding = ListInvitationItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount() = invtitation.size



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentInvi = invtitation[position]
        holder.binding.firstImageInv.setImageResource(currentInvi.pic)
        holder.binding.invitationTitle.text = currentInvi.title
        holder.binding.cardViewInvi.setOnClickListener {
            val intent = Intent(context, ShowInvitationDetails::class.java)
            intent.putExtra("image", currentInvi.pic)
            intent.putExtra("description", currentInvi.title)
            context?.startActivity(intent)
        }

    }




}