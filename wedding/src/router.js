import Vue from 'vue';
import Router from 'vue-router';
import Hello from '@/components/Hello';
import Guests from '@/components/Guests';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/guests',
      name: 'Guests',
      component: Guests
    }
  ]
});
