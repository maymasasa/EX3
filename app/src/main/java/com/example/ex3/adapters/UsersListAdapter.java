package com.example.ex3.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ex3.R;
import com.example.ex3.entities.User;
import com.example.ex3.viewmodels.UsersViewModel;

import java.util.List;

public class UsersListAdapter extends RecyclerView.Adapter<UsersListAdapter.UserViewHolder> {

    class UserViewHolder extends RecyclerView.ViewHolder {
        private final TextView name;
        private final TextView lastMessage;
        private final TextView time;
        private final ImageView pic;

        private UserViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name1);
            lastMessage = itemView.findViewById(R.id.lastMessage);
            time = itemView.findViewById(R.id.time);
            pic = itemView.findViewById(R.id.pic);
        }
    }
    private final LayoutInflater mInflater;
    private List<User> users;
    public UsersListAdapter(Context context){
        mInflater = LayoutInflater.from(context);
    }
    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.user_layout, parent, false);
        return new UserViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        if (users != null) {
            final User current = users.get(position);
            holder.name.setText(current.getName());
            holder.lastMessage.setText(current.getLastMessage());
            holder.time.setText(current.getTime());
            holder.pic.setImageResource(current.getPic());
        }
    }

    public void setUsers(List<User> users) {
        this.users = users;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (users != null)
            return users.size();
        else return 0;
    }

    public List<User> getUsers() {
        return users;
    }
}
