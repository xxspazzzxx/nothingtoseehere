import Vue from 'vue';
import Router from 'vue-router';
import Hello from '@/components/Hello';
import Hosts from '@/components/Guests';
import Carousel from '@/components/Carousel.vue';

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
    },
    {
      path: '/carousel',
      name: 'Carousel',
      component: Carousel
    }
  ]
});
